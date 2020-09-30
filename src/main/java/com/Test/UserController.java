package com.Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.User;
import com.ServiceImpl.UserServiceImpl;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	@Autowired
	UserServiceImpl userService;
	
	@GetMapping("/customers")
	  public List<User> getAllEntity() {
	    return  userService.getAllEntity();
	  }
}
