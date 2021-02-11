package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Laptop;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public List<Laptop> getLaptops(){
        return laptopRepository.findAll();
    }

    public void saveLaptop(Laptop laptop){
        laptopRepository.save(laptop);
    }

    public Optional<Laptop> findLaptopById(int id){
        return laptopRepository.findById(id);
    }

    public void deleteLaptop(int id){
        laptopRepository.deleteById(id);
    }
}
