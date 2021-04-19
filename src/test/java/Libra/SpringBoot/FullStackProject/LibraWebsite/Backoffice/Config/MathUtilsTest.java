package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Config;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers.DesktopsController;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Employee;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Autowired
    DesktopsController desktopsController;

    EmployeeService employee = new EmployeeService();

    @Test
    void test(){
        assertEquals(32,employee.findEmployeeByEmail("robert.crv@icloud.com"));

    }

}