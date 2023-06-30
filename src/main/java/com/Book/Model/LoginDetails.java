package com.Book.Model;

import org.springframework.stereotype.Component;

@Component
public class LoginDetails {

	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	
}
