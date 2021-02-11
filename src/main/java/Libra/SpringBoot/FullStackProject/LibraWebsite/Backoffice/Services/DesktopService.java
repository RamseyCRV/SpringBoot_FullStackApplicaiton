package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Desktop;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories.DesktopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesktopService {

    @Autowired
    private DesktopRepository desktopRepository;

    public List<Desktop> getDesktop(){
        return desktopRepository.findAll();
    }

    public void saveDesktop(Desktop desktop){
        desktopRepository.save(desktop);
    }

    public Optional<Desktop> findDesktopById(int id){
        return desktopRepository.findById(id);
    }

    public void deleteDesktop(int id){
        desktopRepository.deleteById(id);
    }
}
