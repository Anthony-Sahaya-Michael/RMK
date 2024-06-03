package com.example.check.Service;

import org.springframework.stereotype.Service;

import com.example.check.Model.CheckModel;
import com.example.check.Repository.CheckRepository;

@Service
public class CheckService {

    private CheckRepository checkRepository;
    

    public CheckService(CheckRepository checkRepository) {
        this.checkRepository = checkRepository;
    }

    @SuppressWarnings("deprecation")
    public CheckModel getAll(int regNo){
        return checkRepository.getById(regNo);
    }
    public CheckRepository getCheckRepository() {
        return checkRepository;
    }

    public void setCheckRepository(CheckRepository checkRepository) {
        this.checkRepository = checkRepository;
    }
   
    public String addingNewData(CheckModel checkModel){
        checkRepository.save(checkModel);
        return "Added Successfully";
    }
    
}
