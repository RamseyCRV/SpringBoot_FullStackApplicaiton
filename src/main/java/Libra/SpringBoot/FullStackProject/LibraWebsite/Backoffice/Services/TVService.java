package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.TV;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories.TVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TVService {

    @Autowired
    private TVRepository tvRepository;

    public List<TV> getTV(){
        return tvRepository.findAll();
    }

    public void saveTV(TV tv){
        tvRepository.save(tv);
    }

    public Optional<TV> findTVById(int id){
        return tvRepository.findById(id);
    }

    public void deleteTV(int id){
        tvRepository.deleteById(id);
    }
}
