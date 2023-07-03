package com.workshop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TripRepo extends JpaRepository<TripInfo,Integer>{

}
