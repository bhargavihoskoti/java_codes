package com.example.demo.ifaces;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Donor;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Integer> {
	
  public List<Donor> findByRegId(int regId);
	
	@Query(nativeQuery = true,
			value = "update donor set location =:city where regId=:regid")
	@Modifying
	@Transactional
	public int updateLocation(@Param("regid") int regId ,@Param("city") String location);
	
	
	

}
