package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LaptopsController {

    @GetMapping(value = "/backoffice_laptops")
    public String getLaptops(){
        return "./Backoffice/laptops";
    }

}
