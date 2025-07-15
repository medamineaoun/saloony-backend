package com.aoun.usermanagement.service;

import com.aoun.usermanagement.entity.Admin;

import java.util.List;

public interface IAdminService {
    public List<Admin> retrieveAllAdmins();
    public Admin retrieveAdmin(Long adminId);
    public Admin addAdmin(Admin admin);
    public void removeAdmin(Long adminId);
    public Admin modifyAdmin(Admin admin);
}