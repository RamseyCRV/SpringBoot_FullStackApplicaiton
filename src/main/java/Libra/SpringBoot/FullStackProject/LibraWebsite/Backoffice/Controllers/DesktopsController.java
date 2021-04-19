package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Config.FileUploadUtil;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Desktop;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

@Controller
public class DesktopsController {

    private final static String UPLOAD_DIR="src/main/resources/static/Products/Desktops/";
    private final static Logger LOG = Logger.getLogger(DesktopsController.class.getName());

    @Autowired
    private DesktopService desktopService;

    @RequestMapping(value = "/backoffice_desktops/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Desktop desktop){
        desktopService.saveDesktop(desktop);

        LOG.info("Desktop updated...");
        return "redirect:/backoffice_desktops";
    }

    @GetMapping(value = "/backoffice_desktops")
    public String getDesktops(Model model){
        List<Desktop> desktopList = desktopService.getDesktop();
        model.addAttribute("desktops", desktopList);
        LOG.info("Retrieving desktops for Desktop Controller");
        return "./Backoffice/desktops";
    }

    @RequestMapping(value = "/backoffice_desktops/delete" , method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteDesktop(int id){
        LOG.warning("Deleting desktop with id=" + id);
        FileUploadUtil.deleteImage(desktopService.findDesktopById(id).get().getImage());
        desktopService.deleteDesktop(id);
        return "redirect:/backoffice_desktops";
    }

    @RequestMapping("backoffice_desktops/findById")
    @ResponseBody
    public Optional<Desktop> findById(int id){
        LOG.info("Searching for desktop with id=" + id);
        return desktopService.findDesktopById(id);
    }

    @PostMapping(value = "/backoffice_desktops/addNew")
    public RedirectView saveDesktop(@RequestParam("image") MultipartFile multipartFile,
                                    @RequestParam("name")String name,
                                    @RequestParam("price")String price,
                                    @RequestParam("inStock")String inStock,
                                    @RequestParam("unitsSold")String unitsSold,
                                    @RequestParam("description")String description
                                    ) throws IOException {

        int in_stock = Integer.parseInt(inStock);
        int units_sold = Integer.parseInt(unitsSold);

        String imageName = UUID.randomUUID().toString() + StringUtils.cleanPath(multipartFile.getOriginalFilename());

        Desktop desktop = new Desktop();
        desktop.setImage(imageName);
        desktop.setName(name);
        desktop.setPrice(price);
        desktop.setInStock(in_stock);
        desktop.setUnitsSold(units_sold);
        desktop.setDescription(description);

        desktopService.saveDesktop(desktop);

        FileUploadUtil.saveFile(UPLOAD_DIR, imageName, multipartFile);

        LOG.info("Desktop: " + name + " created...");
        return new RedirectView("/backoffice_desktops",true);
    }
}
