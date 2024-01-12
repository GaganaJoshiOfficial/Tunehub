package com.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByEmail(String email);

}
