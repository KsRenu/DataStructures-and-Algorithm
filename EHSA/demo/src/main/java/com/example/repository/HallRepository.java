package com.example.repository;

import com.example.bean.Hall;
import com.example.bean.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HallRepository extends CrudRepository<Hall, String> {
    //List<Student> allocateStudents();
}
