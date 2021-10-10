package com.example.demo.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.DonorRegistry;
import com.example.repos.DonorRepository;


@Service
public class DonorService {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private DonorRepository repo;
	

	public List<DonorRegistry> findAll(){
		
		return this.repo.findAll();
	}
	

	public DonorRegistry addDonor(DonorRegistry entity) {
		
		return this.repo.save(entity);
	}
	

	public  DonorRegistry findById(Integer key) {
		
		return this.repo.getById(key);
				
	}
 public List<DonorRegistry > findByName(String name){
    	
    	return this.repo.findByDonorName(name);
    	
    }
    
    public Collection<DonorRegistry> updateBloodGrp(int regId,String bloodGroup) {
    	
    	return this.repo.updateBloodGrp(regId,bloodGroup);
    }
    
public int remove(int regId) {
	
	int rowDeleted=0;
    	if(this.repo.existsById(regId)) {
    	 this.repo.deleteDonor(regId);
    	rowDeleted=1;
    }
    return	rowDeleted;
	
}

}
