package com.krauze.hibernateDemo.dao;

import com.krauze.hibernateDemo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
