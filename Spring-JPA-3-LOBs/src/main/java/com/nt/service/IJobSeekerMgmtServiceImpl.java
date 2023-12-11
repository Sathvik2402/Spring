package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepo;
@Service("jsService")
public class IJobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private IJobSeekerRepo repo;
	@Override
	public String registerJobSeeker(JobSeeker js) {
	int idVal=repo.save(js).getJsId();
		return "JobSeeker is registered with id"+idVal;
	}

}
