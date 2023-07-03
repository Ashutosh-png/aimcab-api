package com.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Controller {
	@Autowired
   UserService ser;
	
	@Autowired
	UserInfoService userServuce;
	
	@Autowired
	TripService trips;
	
	
	 @PostMapping("/check")
	    public ResponseEntity<User> checkUser(@RequestBody User user) {
	        String name = user.getName();
	        String email = user.getEmail();

	        User foundUser = ser.findUserBynameAndEmail(name, email);

	        if (foundUser != null) {
	            return ResponseEntity.ok(foundUser);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	 
	 
	 @PostMapping("/getuserinfo")
	 public void getinfo(@RequestBody UserInfo info) {
		 System.out.println(info.getName());
		 userServuce.saveUserInfo(info);
	 }
	 
	 
	 @PostMapping("/TripInfo")
	 public void trip(@RequestBody TripInfo trip) {
		 System.out.println(trip);
		 trips.ttripsave(trip);
		
	 }
	 
	 
}
