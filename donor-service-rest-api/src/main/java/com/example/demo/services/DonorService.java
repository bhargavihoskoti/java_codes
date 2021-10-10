package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donor;
import com.example.demo.ifaces.DonorRepository;

@Service
public class DonorService {
	
	@Autowired
	private DonorRepository repo;
	
	public List<Donor> findAll(){
		
		return this.repo.findAll();
	}
	
	public Donor addDonor(Donor entity) {
		
		return this.repo.save(entity);
	}
	

	public List<Donor> findByRegId(int regId) {
		
		return this.repo.findByRegId(regId);
	}
	public int updateLocation(int regId, String location) {

		return this.repo.updateLocation(regId, location);
	}

	public int remove(int regId) {
		
		int rowDeleted=0;
	    	if(this.repo.existsById(regId)) {
	    	 this.repo.deleteById(regId);
	    	rowDeleted=1;
	    }
	    return	rowDeleted;
	}

	
	

}
