package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
