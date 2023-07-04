package com.example.controller;

import com.example.bean.Hall;
import com.example.bean.Student;
import com.example.service.HallService;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    private HallService hallService;
    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
    public void updateStudent(@PathVariable String id, @RequestBody Student student){
        studentService.updateStudent(id, student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);
    }


    @RequestMapping("/allocatedPlaces")
    public List<Hall> allocateStudents(){

        return hallService.allocateStudents();
    }


}
