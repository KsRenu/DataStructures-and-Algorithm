package com.example.repository;

import com.example.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, String> {
}
