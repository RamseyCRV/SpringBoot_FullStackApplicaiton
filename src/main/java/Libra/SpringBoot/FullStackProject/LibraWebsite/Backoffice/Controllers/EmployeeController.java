package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping(value = "/backoffice_employee")
    public String getEmployee(){
        return "./Backoffice/employee";
    }
}
