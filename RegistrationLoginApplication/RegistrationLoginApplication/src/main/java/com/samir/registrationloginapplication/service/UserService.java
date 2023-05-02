package com.samir.registrationloginapplication.service;

import java.util.List;

import com.samir.registrationloginapplication.dto.UserDto;
import com.samir.registrationloginapplication.model.User;

public interface UserService {
	void saveUser(UserDto userDto);
	User findByfirstName(String firstName);
	List<UserDto> findAllUser();

}
