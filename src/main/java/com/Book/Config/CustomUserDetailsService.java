package com.Book.Config;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Book.Entity.UserEntity;
import com.Book.Repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	 private UserRepository userRepository;

	
	    public CustomUserDetailsService() {
		super();
		
	}

		public CustomUserDetailsService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }
	    
	@Override
	public UserDetails loadUserByUsername(String userNameOrEmail) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 UserEntity user = userRepository.findByNameOrEmail(userNameOrEmail, userNameOrEmail)
				 .orElseThrow(()->new UsernameNotFoundException("user not found"));

		 Set<GrantedAuthority> authorities = user.getRoles().stream()
	                .map((role) -> new SimpleGrantedAuthority(role.getName()))
	                .collect(Collectors.toSet());

	        return new org.springframework.security.core.userdetails.User(
	                userNameOrEmail,
	                user.getPassword(),
	                authorities
	        );
	        
	}
	
	

}
