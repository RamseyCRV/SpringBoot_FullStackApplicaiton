package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DesktopsController {

    @GetMapping(value = "/backoffice_desktops")
    public String getDesktops(){
        return "./Backoffice/desktops";
    }
}
