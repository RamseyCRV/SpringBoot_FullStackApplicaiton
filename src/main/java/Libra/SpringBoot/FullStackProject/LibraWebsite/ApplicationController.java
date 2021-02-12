package Libra.SpringBoot.FullStackProject.LibraWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping(value = "/backoffice_login")
    public String getBackofficeLogin(){ return "./Backoffice/login"; }

    @GetMapping(value = "/backoffice_register")
    public String getBackofficeRegister(){ return "./Backoffice/register"; }

    @GetMapping(value = "/backoffice_logout")
    public String getBackofficeLogout() { return "./Backoffice/logout"; }
}
