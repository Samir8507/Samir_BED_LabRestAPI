package com.samir.registrationloginapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samir.registrationloginapplication.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findByfirstName(String firstName);

}
