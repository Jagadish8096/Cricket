package com.myapplication.Registration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapplication.Registration.Entity.UserReg;
import com.myapplication.Registration.UserRepository.UserRepository;
@Service
public class UserService {
	@Autowired
	  private UserRepository  userRepository ;

	public UserReg createData(UserReg userReg) {
		// TODO Auto-generated method stub
		return userRepository.save(userReg);
	}

	

	public UserReg fetchByUserNameAndPassword(String tempUserName, String tempPassword) {
		// TODO Auto-generated method stub
		return userRepository.findByUserNameAndPassword(tempUserName,tempPassword);
	}
}
