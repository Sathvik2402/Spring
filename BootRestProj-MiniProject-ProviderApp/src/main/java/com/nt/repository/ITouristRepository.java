package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Tourist;

	public interface ITouristRepository extends JpaRepository<Tourist, Integer>{
		
	@Query("from Tourist where city in(:city1,:city2,:city3) order by tname asc")
	public List<Tourist> findTouristByCities(String city1,String city2,String city3);
}
