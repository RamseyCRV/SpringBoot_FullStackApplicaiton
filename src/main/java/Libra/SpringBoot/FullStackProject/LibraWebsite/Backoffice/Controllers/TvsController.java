package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TvsController {

    @GetMapping(value = "/backoffice_tvs")
    public String getTvs(){
        return "./Backoffice/tvs";
    }
}
