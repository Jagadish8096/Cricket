package com.myapplication.Registration.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserReg {
	@Id
	private String userName;
	private int age;
	private String gender;
	private String hobbies;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserReg(String userName, int age, String gender, String hobbies, String password) {
		super();
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.hobbies = hobbies;
		this.password = password;
	}
	public UserReg() {
		super();
	}
	
}
