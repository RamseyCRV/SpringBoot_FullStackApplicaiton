package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.TV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TVRepository extends JpaRepository<TV, Integer> {
}
