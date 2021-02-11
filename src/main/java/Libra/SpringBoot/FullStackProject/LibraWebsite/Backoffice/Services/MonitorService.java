package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Services;

import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models.Monitor;
import Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Repositories.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    public List<Monitor> getMonitor(){
        return monitorRepository.findAll();
    }

    public void saveMonitor(Monitor monitor){
        monitorRepository.save(monitor);
    }

    public Optional<Monitor> findMonitorById(int id){
        return monitorRepository.findById(id);
    }

    public void deleteMonitor(int id){
        monitorRepository.deleteById(id);
    }
}
