package Libra.SpringBoot.FullStackProject.LibraWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {


    @GetMapping(value = "/backofficelogin")
    public String getBackofficeLogin(){ return "./Backoffice/login"; }

    @GetMapping(value = "/backofficeregister")
    public String getBackofficeRegister(){ return "./Backoffice/register"; }

    @GetMapping(value = "/backofficelogout")
    public String getBackofficeLogout() { return "./Backoffice/logout"; }
}
