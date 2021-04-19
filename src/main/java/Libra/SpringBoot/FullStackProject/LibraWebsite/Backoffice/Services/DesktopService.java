package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Desktop;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories.DesktopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
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

    /**
     * Find desktop with identifier
     * @param id unique identifier
     * @return the desktop
     */
    public Optional<Desktop> findDesktopById(int id){
        return desktopRepository.findById(id);
    }

    /**
     * This method will delete a Desktop object
     * @param id unique identifier
     */
    public void deleteDesktop(Integer id){
        desktopRepository.deleteById(id);
    }


}
