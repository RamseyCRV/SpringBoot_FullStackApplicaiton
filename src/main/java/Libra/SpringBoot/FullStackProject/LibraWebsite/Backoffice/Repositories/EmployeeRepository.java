package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
