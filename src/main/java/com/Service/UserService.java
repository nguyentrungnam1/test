package com.Service;

import java.util.List;

import com.Entity.User;

public interface UserService {
	
	public List<User> getAllEntity();
	
	public User getNewById(int id);
	
	public User findOne(int id);
	
	public void save(User news);
	
	public void delete(int id);
}
