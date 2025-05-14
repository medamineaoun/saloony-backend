package com.aoun.usermanagement.repository;

import com.aoun.usermanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
