package com.example.repos;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.DonorRegistry;

@Repository
public interface DonorRepository extends JpaRepository<DonorRegistry, Integer> {
	
public List<DonorRegistry> findByDonorName(String srchName);
	
	@Query(nativeQuery = true,
			value = "update donorregistry set bloodGroup =:bloodgroup where regId=:regid")
	@Modifying
	@Transactional
	public Collection<DonorRegistry> updateBloodGrp(@Param("regid") int regId,@Param("bloodgroup") String bloodGroup );
	
	
	
	@Query(nativeQuery= true,
			value="DELETE FROM donorregistry WHERE regid=:regid")
	@Modifying
	@Transactional
	public int deleteDonor(@Param("regid") int regId);


	
	

}
