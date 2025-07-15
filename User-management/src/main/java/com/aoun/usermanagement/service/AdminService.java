package com.aoun.usermanagement.service;

import com.aoun.usermanagement.entity.Admin;
import com.aoun.usermanagement.repository.AdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdminService implements IAdminService{
    AdminRepository adminRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public List<Admin> retrieveAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin retrieveAdmin(Long adminId) {
        return adminRepository.findById(adminId).get();
    }

    @Override
    public Admin addAdmin(Admin admin) {
        admin.setUserRole("ADMIN");
        admin.setUserPassword(passwordEncoder.encode(admin.getUserPassword()));
        return adminRepository.save(admin);
    }

    @Override
    public void removeAdmin(Long adminId) {
        adminRepository.deleteById(adminId);
    }

    @Override
    public Admin modifyAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
