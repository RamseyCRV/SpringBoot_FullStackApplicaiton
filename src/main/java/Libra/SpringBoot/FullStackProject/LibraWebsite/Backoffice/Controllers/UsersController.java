package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping(value = "/backoffice_users")
    public String getUsers(){
        return "./Backoffice/users";
    }
}
