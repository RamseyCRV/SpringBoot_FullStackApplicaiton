package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Desktop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopRepository extends JpaRepository<Desktop, Integer> {
}
