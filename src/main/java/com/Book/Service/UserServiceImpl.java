package com.Book.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Book.Entity.Role;
import com.Book.Entity.UserEntity;
import com.Book.Model.UserDto;
import com.Book.Repository.RoleRepository;
import com.Book.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	

	@Override
	public Integer saveUser(UserEntity userEntity) {
		
		
		
		return userRepo.save(userEntity).getUserId();
		
	}



	@Override
	public UserEntity findUserByEmail(String email) {
		
		 return userRepo.findByEmail(email);
	}



	@Override
	public List<UserDto> findAllUsers() {
		List<UserEntity> users = userRepo.findAll();
        return users.stream()
                .map((user) -> mapToUserDto(user))
                .collect(Collectors.toList());
	}
	
	private UserDto mapToUserDto(UserEntity user){
        UserDto userDto = new UserDto();
        String[] str = user.getName().split(" ");
        userDto.setFirstName(str[0]);
        userDto.setLastName(str[1]);
        userDto.setEmail(user.getEmail());
        return userDto;
    }

    private Role checkRoleExist(){
        Role role = new Role();
        role.setName("ROLE_ADMIN");
        return roleRepo.save(role);
    }

}
