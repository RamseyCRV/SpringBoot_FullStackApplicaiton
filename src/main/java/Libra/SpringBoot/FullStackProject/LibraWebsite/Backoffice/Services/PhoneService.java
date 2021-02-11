package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Phone;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    public List<Phone> getPhone(){
        return phoneRepository.findAll();
    }

    public void savePhone(Phone phone){
        phoneRepository.save(phone);
    }

    public Optional<Phone> findPhoneById(int id){
        return phoneRepository.findById(id);
    }

    public void deletePhone(int id){
        phoneRepository.deleteById(id);
    }
}
