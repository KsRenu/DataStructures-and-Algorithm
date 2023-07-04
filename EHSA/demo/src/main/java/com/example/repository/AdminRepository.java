package com.example.repository;

import com.example.bean.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, String> {
}
