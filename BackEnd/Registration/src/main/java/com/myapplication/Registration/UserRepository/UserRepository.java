package com.myapplication.Registration.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapplication.Registration.Entity.UserReg;
@Repository
public interface UserRepository extends JpaRepository<UserReg,String> {

	//UserReg findByUserNameAndPassword(String tempUserName, String tempPassword);

	UserReg findByUserNameAndPassword(String tempUserName, String tempPassword);

}
