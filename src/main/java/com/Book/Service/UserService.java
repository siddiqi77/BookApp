package com.Book.Service;

import java.util.List;

import com.Book.Entity.UserEntity;
import com.Book.Model.UserDto;

public interface UserService {
	
	public Integer saveUser(UserEntity userEntity);
	public  UserEntity findUserByEmail(String email);

	    List<UserDto> findAllUsers();

}
