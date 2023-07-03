package com.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
	
	@Autowired
	private UserInfoRepo repo;
	
	
	public void saveUserInfo(UserInfo info) {
		repo.save(info);
	}
	

}
