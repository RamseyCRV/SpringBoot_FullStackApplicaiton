package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;


import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Config.FileUploadUtil;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Desktop;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories.DesktopRepository;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services.DesktopService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Controller
public class DesktopsController {

    private String uploadFolder = "/resources";
    @Autowired
    private DesktopService desktopService;
    @Autowired
    private DesktopRepository desktopRepository;

    @RequestMapping(value = "/backoffice_desktops/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Desktop desktop){
        desktopService.saveDesktop(desktop);
        return "redirect:/backoffice_desktops";
    }

    @GetMapping(value = "/backoffice_desktops")
    public String getDesktops(Model model){
        List<Desktop> desktopList = desktopService.getDesktop();
        model.addAttribute("desktops", desktopList);
        return "./Backoffice/desktops";
    }

    @RequestMapping(value = "/backoffice_desktops/delete" , method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteDesktop(int id){
        desktopService.deleteDesktop(id);
        return "redirect:/backoffice_desktops";
    }

    @RequestMapping("backoffice_desktops/findById")
    @ResponseBody
    public Optional<Desktop> findById(int id){
        return desktopService.findDesktopById(id);
    }

    @PostMapping(value = "/backoffice_desktops/addNew")
    public String newDesktop(@RequestParam("image") MultipartFile file,
                             @RequestParam("name")String name,
                             @RequestParam("price")String price,
                             @RequestParam("description")String description,
                             @RequestParam("inStock")int inStock,
                             @RequestParam("unitsSold")int unitsSold,
                             HttpServletRequest request){

        try{
            String uploadDirectory = request.getServletContext().getRealPath(uploadFolder);
            String fileName = file.getOriginalFilename();
            String filePath = Paths.get(uploadDirectory, fileName).toString();
            try{
                File dir = new File(uploadDirectory);
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // Save the file locally
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filePath)));
                stream.write(file.getBytes());
                stream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            byte[] imageData = file.getBytes();
            Desktop desktop = new Desktop();
            desktop.setName(name);
            desktop.setDescription(description);
            desktop.setInStock(inStock);
            desktop.setUnitsSold(unitsSold);
            desktop.setImage(imageData);
            desktop.setPrice(price);
            desktopRepository.save(desktop);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "redirect:/backoffice_desktops";
    }
}
