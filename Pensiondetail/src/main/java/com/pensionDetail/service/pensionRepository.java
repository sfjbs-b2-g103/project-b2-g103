package com.pensionDetail.service;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pensionDetail.entity.PensionDetails;

@Repository
public interface pensionRepository extends JpaRepository<PensionDetails, Integer> {

	Optional<PensionDetails> findByAadhar(Integer aadhar);

	void deleteByAadhar(Integer aadhar);
	

}
