package com.Book.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Book.Entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	UserEntity findByEmail(String email);
	Optional<UserEntity> findByNameOrEmail(String username, String email);
}
