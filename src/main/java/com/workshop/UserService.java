package com.workshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private Repo repo;
	
	
	
	public void save(User user) {
		repo.save(user);
	}
	
	public void delete(User user) {
		repo.delete(user);
	}
	
	public User findById(int id) {
		return repo.findById(id).get();
	}
	
	
	public User findUserBynameAndEmail(String name,String email) {
		return repo.findByNameAndEmail(name, email);
	}

}
