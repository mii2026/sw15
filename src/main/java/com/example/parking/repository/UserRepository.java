package com.example.parking.repository;

import com.example.parking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsById(String id);
    boolean existsByPhoneNum(String phoneNum);
    boolean existsByEmail(String email);
    Optional<User> findById(String id);
}
