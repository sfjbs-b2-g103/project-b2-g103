package com.pensionDetail.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pensionDetail.entity.PensionDetails;
import com.pensionDetail.exception.ResourceNotFoundException;



@Service
public class PensionServiceImpl implements PensionService {
	@Autowired
	pensionRepository pensionRepository;

	@Override
	public Integer saveDetail(PensionDetails detail) {
		PensionDetails savedDetail =pensionRepository.save(detail);
		return savedDetail.getAadhar();
	}
	@Override
	public Optional<PensionDetails> getDetail(Integer aadhar) {
		
		return pensionRepository.findByAadhar(aadhar);
	}

	@Override
	public List<PensionDetails> getALLDetails() {
		return pensionRepository.findAll();
	}

	@Override
	public void deleteDetail(Integer aadhar) {
		 pensionRepository.deleteByAadhar(aadhar);
		
	}
	@Override
	public Integer updateDetail(PensionDetails detail, Integer aadhar) {
		PensionDetails existingDetail = pensionRepository.findByAadhar(aadhar).orElseThrow( () -> new ResourceNotFoundException("detail","aadhar",aadhar) );
		existingDetail.setDateOfBirth(detail.getDateOfBirth());
		existingDetail.setName(detail.getName());
		existingDetail.setPan(detail.getPan());
		existingDetail.setSalary(detail.getSalary());
		existingDetail.setAllowance(detail.getAllowance());
		existingDetail.setPensionType(detail.getPensionType());
		existingDetail.setBankName(detail.getBankName());
		existingDetail.setAccountNumber(detail.getAccountNumber());
		existingDetail.setBankType(detail.getBankType());
		pensionRepository.save(existingDetail);
			return existingDetail.getAadhar();
		
	}

}