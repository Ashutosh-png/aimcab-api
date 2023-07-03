package com.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {
	
	@Autowired
	TripRepo repo;
	
	
	
	public void ttripsave(TripInfo info) {
		repo.save(info);
	}

}
