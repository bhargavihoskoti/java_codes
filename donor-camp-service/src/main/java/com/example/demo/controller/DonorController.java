package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DonorRegistry;
import com.example.demo.services.DonorService;


@RestController
@RequestMapping(path="/api/v1/donors")
public class DonorController {
	private DonorService service;
	
	
	
	@Autowired
	public void setService(DonorService service) {
		this.service=service;
	}
	
	@GetMapping
	public List<DonorRegistry> findAll(){
		
		return this.service.findAll("http://BOOK-SERVICE/books",List<String>.class);
	}
	
	@GetMapping(path="/{regId}")
	public DonorRegistry findById(@PathVariable("regIdr") int regId){
		
		return this.service.findById(regId);
	}
	
	@GetMapping(path="/srch/{name}")
	public List<DonorRegistry> findByName(@PathVariable("name") String DonorRegistryName){
		
		return this.service.findByName(DonorRegistryName);
	}
	
	@PutMapping(path="/{regId}/{bloodGroup}")
	public ResponseEntity<String> updateBloodGroup(@PathVariable("bloodGroup") String bloodGroup,
			@PathVariable("regId") int regId){
		Collection<DonorRegistry> count =this.service.updateBloodGrp(regId, bloodGroup);
		return ResponseEntity.ok().body(count+":=Records Updated");
	}
	
	@DeleteMapping(path="/{regId}")
	public ResponseEntity<String> removeDonorRegistry(@PathVariable("regId") int regId)
			{
		int count =this.service.remove(regId);
		HttpStatus status =HttpStatus.NOT_FOUND;
		String message ="Record Not Found";
		if (count==1) {
			status =HttpStatus.OK;
			message ="One Record Deleted";
			
		}
			
					return ResponseEntity.status(status).body(message);
	
	
	
			}
	@PostMapping
	public ResponseEntity<DonorRegistry>  add(@RequestBody DonorRegistry entity) {
		DonorRegistry addedEntity =this.service.addDonor(entity);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
	}

}
