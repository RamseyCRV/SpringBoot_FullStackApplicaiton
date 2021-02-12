package Libra.SpringBoot.FullStackProject.LibraWebsite;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Employee;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LibraWebsiteApplication{
// implements CommandRunner
	public static void main(String[] args) {
		SpringApplication.run(LibraWebsiteApplication.class, args);
	}

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//	@Autowired
//	private EmployeeRepository employeeRepository;

//	@Override
//	public void run(String... args) throws Exception {
//		employeeRepository.save(new Employee("Robert","Vasile", "robert.crv@icloud.com", "src/main/resource/static/avatar/ramsey/png" , "Developer", "Ciapa", bCryptPasswordEncoder.encode("pass"), 4300, true));
//	}
}
