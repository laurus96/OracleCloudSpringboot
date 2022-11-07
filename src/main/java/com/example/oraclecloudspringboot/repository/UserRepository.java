package com.example.oraclecloudspringboot.repository;

import com.example.oraclecloudspringboot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
