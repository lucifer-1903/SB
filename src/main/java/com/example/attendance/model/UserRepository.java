package com.example.attendance.repository;

import com.example.attendance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods if needed
}
