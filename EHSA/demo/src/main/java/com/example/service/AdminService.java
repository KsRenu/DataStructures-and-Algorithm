package com.example.service;
import com.example.bean.Admin;
import com.example.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {
@Autowired
public AdminRepository adminRepo;
    public List<Admin> getAllAdmins()
    {
        List <Admin> admins = new ArrayList<>();
        adminRepo.findAll().forEach(admins::add);
        return admins;
    }

    public void addAdmins(Admin admin) {
        adminRepo.save(admin);
    }
    public void updateAdmin(String id, Admin admin) {
        adminRepo.save(admin);
    }



    public void deleteAdmin(String id) {
        adminRepo.deleteById(id);
    }
}
