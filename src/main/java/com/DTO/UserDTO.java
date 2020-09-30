package com.DTO;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.Entity.User;


public class UserDTO {
	private int id;	
	private String userName;
	private String address;
	private int phone;
	
	
	public User tranferEntity(UserDTO userDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userDTO, User.class);
	}
	
	
	public UserDTO tranferObject(User user) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(user, UserDTO.class);
	}


	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
		
	
}
