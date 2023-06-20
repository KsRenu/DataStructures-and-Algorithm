package com.CRUDApplication.Sample.Web.App.repository;

import com.CRUDApplication.Sample.Web.App.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
