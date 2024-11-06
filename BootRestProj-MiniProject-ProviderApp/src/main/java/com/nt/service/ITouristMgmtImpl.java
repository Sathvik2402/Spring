package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nt.entity.Tourist;
import com.nt.repository.ITouristRepository;

@Service
public class ITouristMgmtImpl implements ITouristMgmtService{

	@Autowired
	ITouristRepository repo;
	
@Override
public String registerTourist(Tourist tourist) {
	
	Integer tid=repo.save(tourist).getTid();
	
	return "Tourist with TID "+tid+" saved";
}

@Override
public List<Tourist> showAllTourist() {
	List<Tourist> li=repo.findAll();
	li.sort((t1,t2)->t1.getTname().compareToIgnoreCase(t2.getTname()));
return li;
}

@Override
public List<Tourist> findByCity(String city1, String city2, String city3) {
	return repo.findTouristByCities(city1, city2, city3);
}

}
