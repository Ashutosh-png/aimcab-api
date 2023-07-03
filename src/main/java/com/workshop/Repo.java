package com.workshop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<User,Integer>{
	
	public User findByNameAndEmail(String name, String email);

}
