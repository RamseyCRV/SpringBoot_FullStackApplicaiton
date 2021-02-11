package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
