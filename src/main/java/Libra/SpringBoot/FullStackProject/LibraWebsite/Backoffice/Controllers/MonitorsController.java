package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MonitorsController {

    @GetMapping(value = "/backoffice_monitors")
    public String getMonitors(){
        return "./Backoffice/monitors";
    }

}
