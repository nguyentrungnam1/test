package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.DTO.UserDTO;
import com.Entity.User;
import com.Repository.UserRepository;

@Component
public class UserDAO {
	@Autowired
	UserRepository userRepository;
	
	public List<User>findAllUser(){
		
		return (List<User>)userRepository.findAll();
	}

	
}
