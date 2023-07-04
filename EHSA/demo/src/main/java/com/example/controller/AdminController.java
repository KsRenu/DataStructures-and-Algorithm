package com.example.controller;
import com.example.bean.Admin;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/admins")
    public List<Admin> getAllAdmin(){
        return adminService.getAllAdmins();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/admins")
    public void addAdmin(@RequestBody Admin admin){
        adminService.addAdmins(admin);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/admins/{id}")
    public void updateAdmin(@PathVariable String id, @RequestBody Admin admin){
        adminService.updateAdmin(id, admin);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/admins/{id}")
    public void deleteAdmin(@PathVariable String id){
        adminService.deleteAdmin(id);
    }

}
