package com.krauze.hibernateDemo.dao;

import com.krauze.hibernateDemo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminDao extends JpaRepository<Admin, Long> {
    Optional<Admin> findById(Long id);
}
