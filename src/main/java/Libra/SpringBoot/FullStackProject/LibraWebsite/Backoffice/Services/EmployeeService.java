package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Employee;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    public void saveEmplopyee(Employee employee){
        employeeRepository.save(employee);
    }

    public Optional<Employee> findEmployeeById(int id){
        return employeeRepository.findById(id);
    }

    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }
}
