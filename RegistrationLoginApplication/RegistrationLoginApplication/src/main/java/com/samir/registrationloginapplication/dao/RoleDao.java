package com.samir.registrationloginapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samir.registrationloginapplication.model.Role;

public interface RoleDao extends JpaRepository<Role, Integer> {
	Role findByName(String name);

}
