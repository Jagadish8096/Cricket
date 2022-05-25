package com.myapplication.Registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapplication.Registration.Entity.UserReg;
import com.myapplication.Registration.Service.UserService;
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	@CrossOrigin(origins="http://localhost:4200/")
	public UserReg create(@RequestBody UserReg userReg) {
		return userService.createData(userReg);
	}

	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200/")
	public UserReg login(@RequestBody UserReg userReg) throws Exception {
		String tempUserName=userReg.getUserName();
		String tempPassword=userReg.getPassword();
		UserReg userObject=null;
		if(tempUserName !=null && tempPassword !=null ) {
			userObject=userService.fetchByUserNameAndPassword(tempUserName, tempPassword);
		}
		if(userObject==null) {
			throw new Exception("User Not Found");
		}
		return userObject;
		
	}
}
