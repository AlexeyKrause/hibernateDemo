package com.krauze.hibernateDemo.dao;

import com.krauze.hibernateDemo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin, Long> {
}
