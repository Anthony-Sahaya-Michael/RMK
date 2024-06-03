package com.example.check.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.check.Model.CheckModel;
import com.example.check.Service.CheckService;


@RestController
public class DemoController {

    private CheckService checkService;
    
    public DemoController(CheckService checkService) {
        this.checkService = checkService;
    }

    @PostMapping("/pathVariable/{id}")
    public String pathExample(@PathVariable String id){
        return "Happy number " + id;
    }

    @GetMapping("/request")
    public CheckModel requestExample(){
        CheckModel obj = new CheckModel(1, "Anthony", "80");
        return obj;
    }

    public CheckService getCheckService() {
        return checkService;
    }

    public void setCheckService(CheckService checkService) {
        this.checkService = checkService;
    }

    @PostMapping("/addNewData")
    public String addingNewData(@RequestBody CheckModel checkModel){
        
        checkService.addingNewData(checkModel);
        return "Added Successfully";
    }

}
