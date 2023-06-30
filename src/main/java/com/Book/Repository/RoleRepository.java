package com.Book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Book.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
}
