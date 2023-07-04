package com.example.service;

import com.example.bean.Admin;
import com.example.bean.Hall;
import com.example.bean.Student;
import com.example.repository.AdminRepository;
import com.example.repository.HallRepository;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HallService {

    @Autowired
    public HallRepository hallRepo;
    public StudentRepository studentRepo;

    public List<Hall> getAllStudentsAllocation() {
        List <Hall> positions = new ArrayList<>();
        hallRepo.findAll().forEach(positions::add);
        return positions;

    }

    public List<Hall> allocateStudents() {
        List <Hall> positions = new ArrayList<>();
        hallRepo.findAll().forEach(positions::add);
        List<Hall> allocatedStudents = new ArrayList<>();
        for(int i=0;i<positions.size();i++){
            if(positions.get(i + 1)[1] == positions.get(i)[1]){

            }
        }
        return positions;

    }
    public void addPosition(Hall position)
    {
        hallRepo.save(position);
    }



}
