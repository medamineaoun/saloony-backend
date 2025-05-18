package com.aoun.usermanagement.controller;

import com.aoun.usermanagement.entity.Admin;
import com.aoun.usermanagement.entity.Admin;
import com.aoun.usermanagement.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/admin")
public class AdminController {
    AdminService adminService;
    @GetMapping("/retrieve-all-admins")
    public List<Admin> getAdmins(){
        return adminService.retrieveAllAdmins();
    }

    @PostMapping("/add-admin")
    public Admin addAdmin(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }

    @GetMapping("/retrieve-admin/{admin-id}")
    public Admin retrieveAdmin(@PathVariable("admin-id") Long adminId){
        return adminService.retrieveAdmin(adminId);
    }

    @DeleteMapping("/remove-admin/{admin-id}")
    public void removeAdmin(@PathVariable("admin-id") Long adminId){
        adminService.removeAdmin(adminId);
    }

    @PutMapping("/modify-admin")
    public Admin modifyAdmin(@RequestBody Admin admin){
        return adminService.modifyAdmin(admin);
    }
}
