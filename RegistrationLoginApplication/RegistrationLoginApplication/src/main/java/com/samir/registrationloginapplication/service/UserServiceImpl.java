package com.samir.registrationloginapplication.service;

import java.util.Arrays;
import java.util.List;

import com.samir.registrationloginapplication.dao.RoleDao;
import com.samir.registrationloginapplication.dao.UserDao;
import com.samir.registrationloginapplication.dto.UserDto;
import com.samir.registrationloginapplication.model.Role;
import com.samir.registrationloginapplication.model.User;

public class UserServiceImpl implements UserService {

	private UserDao userdao;
	private RoleDao roledao;
	public UserServiceImpl(UserDao userdao, RoleDao roledao) {
		super();
		this.userdao = userdao;
		this.roledao = roledao;
		
	}

	public void saveUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setFirstName(userDto.getFirstName() +"" + userDto.getLastName());
		user.setCourse(userDto.getCourse() +""+ userDto.getCountry());
		Role role = roledao.findByName("ROLE_ADMIN");
		if(role == null) {
			role= checkRoleExit();
		}
		user.setRoles(Arrays.asList(role));
		userdao.save(user);
	}

	private Role checkRoleExit() {
		// TODO Auto-generated method stub
		Role role = new Role();
		role.setName("ROLE_ADMIN");
		return roledao.save(role);
	}

	@Override
	public User findByfirstName(String firstName) {
		// TODO Auto-generated method stub
		return userdao.findByfirstName(firstName);
	}

	@Override
	public List<UserDto> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
