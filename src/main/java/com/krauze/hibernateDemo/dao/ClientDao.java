package com.krauze.hibernateDemo.dao;

import com.krauze.hibernateDemo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Long> {
}
