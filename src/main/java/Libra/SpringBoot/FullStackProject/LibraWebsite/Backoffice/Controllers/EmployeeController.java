package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Config.FileUploadUtil;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Employee;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

@Controller
public class EmployeeController {

    private final static String UPLOAD_DIR="src/main/resources/static/avatar/";
    private final static Logger LOG = Logger.getLogger(EmployeeController.class.getName());

    @Autowired
    private EmployeeService employeeService;

//    @RequestMapping(value = "/backoffice_employees/update", method = {RequestMethod.PUT, RequestMethod.GET})
//    public String updateEmployee(Employee employee){
//        employeeService.saveEmplopyee(employee);
//
//        LOG.info("Employee updated...");
//        return "redirect:/backoffice_employees";
//    }
//
//    @GetMapping(value = "/backoffice_employees")
//    public String getEmployees(Model model){
//        List<Employee> employeeList = employeeService.getEmployee();
//        model.addAttribute("employees", employeeList);
//
//        LOG.info("Retrieving employees");
//        return "./Backoffice/employee";
//    }
//
//    @RequestMapping(value = "/backoffice_employees/delete" , method = {RequestMethod.DELETE, RequestMethod.GET})
//    public String deleteEmployee(int id){
//        LOG.warning("Deleting employee with id=" + id);
//        FileUploadUtil.deleteImage(employeeService.findEmployeeById(id).get().getAvatar());
//        employeeService.deleteEmployee(id);
//        return "redirect:/backoffice_employees";
//    }
//
//    @RequestMapping("backoffice_employees/findById")
//    @ResponseBody
//    public Optional<Employee> findById(int id){
//        LOG.info("Searching for employeewith id=" + id);
//        return employeeService.findEmployeeById(id);
//    }
//
//    @PostMapping(value = "/backoffice_employees/addNew")
//    public RedirectView saveEmployee(@RequestParam("avatar") MultipartFile multipartFile,
//                                    @RequestParam("email") String email,
//                                    @RequestParam("firstName")String firstName,
//                                    @RequestParam("lastName")String lastName,
//                                    @RequestParam("jobtitle")String jobTitle,
//                                    @RequestParam("phoneNumber")String phone,
//                                    @RequestParam("salary")String salary,
//                                     @RequestParam("password") String password,
//                                     @RequestParam("isAdmin")Boolean isAdmin
//    ) throws IOException {
//
//        final int salary_employee = Integer.parseInt(salary);
//        final String avatarName = UUID.randomUUID().toString() + StringUtils.cleanPath(multipartFile.getOriginalFilename());
//        Employee employee = new Employee();
//
//        employee.setAvatar(avatarName);
//        employee.setEmail(email);
//        employee.setAdmin(isAdmin);
//        employee.setFirstName(firstName);
//        employee.setLastName(lastName);
//        employee.setJobTitle(jobTitle);
//        employee.setSalary(salary_employee);
//        employee.setPhoneNumber(phone);
//        employee.setPassword(password);
//
//        employeeService.saveEmplopyee(employee);
//
//        FileUploadUtil.saveFile(UPLOAD_DIR, avatarName, multipartFile);
//
//        LOG.info("Employee: " + email + " created...");
//        return new RedirectView("/backoffice_employees",true);
//    }
}
