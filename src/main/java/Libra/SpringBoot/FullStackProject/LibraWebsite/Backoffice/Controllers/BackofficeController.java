package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BackofficeController {

    @GetMapping(value = "/backoffice_dashboard")
    public String getBackoffice(){
        return "./Backoffice/dashboard";
    }

}
