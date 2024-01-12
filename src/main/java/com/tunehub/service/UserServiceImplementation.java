package com.tunehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.User;
import com.tunehub.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	@Autowired
	UserRepository repo;

	@Override
	public String addUser(User user) {
		repo.save(user);
		return "user added successfully";
	}

	@Override
	public boolean emailExists(String email) {
		if(repo.findByEmail(email)==null) {
			return false;
			
		}else {
			return true;
	}

}

	@Override
	public boolean validateUser(String email, String password) {
	  User user = repo.findByEmail(email);
	  String db_pass = user.getPassword();
	  if(password.equals(db_pass)) {
		  return true;
	  }
	  else {
		return false;
	}}

	@Override
	public String getRole(String email) {
		User user = repo.findByEmail(email);
		return user.getRole();
	}

	@Override
	public User getuser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		repo.save(user);
			}}
