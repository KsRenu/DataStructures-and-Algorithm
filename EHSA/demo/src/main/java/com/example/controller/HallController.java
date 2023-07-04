package com.example.controller;

import com.example.bean.Hall;
import com.example.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HallController {
    @Autowired
    private HallService hallService;
    @RequestMapping("/allocatedPlaces")
    public List<Hall> getAllStudentsAllocation(){
        return hallService.getAllStudentsAllocation();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/allocatedPlaces")
    public void addPosition(@RequestBody Hall position){
            hallService.addPosition(position);
    }

}
