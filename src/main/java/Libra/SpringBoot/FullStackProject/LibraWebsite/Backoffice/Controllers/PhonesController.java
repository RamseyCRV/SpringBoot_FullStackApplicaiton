package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhonesController {

    @GetMapping(value = "/backoffice_phones")
    public String getPhones(){
        return "./Backoffice/phones";
    }
}
