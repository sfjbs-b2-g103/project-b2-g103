package com.process.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.process.entity.ProcessDetails;
import com.process.repository.ProcessRepo;

@Service
public class ProcessServiceImpl implements ProcessService {
	 
	@Autowired
	ProcessRepo processRepo;
	
	@Override
	public ProcessDetails calulatePensionAmount(ProcessDetails processDetails) {
		double pensionAmount = 0;
		if (processDetails.getPensionType().equalsIgnoreCase("self")) {
			pensionAmount = (0.8*processDetails.getSalary() + processDetails.getAllowance());
		} else if (processDetails.getPensionType().equalsIgnoreCase("family")) {
			pensionAmount = (0.5 * processDetails.getSalary() + processDetails.getAllowance());
		}
		if (processDetails.getBankType().equalsIgnoreCase("private")) {
			pensionAmount = pensionAmount - 550;
		}
		else if (processDetails.getBankType().equalsIgnoreCase("public")) {
			pensionAmount = pensionAmount - 500;
		}
		return processDetails;
	}

	@Override
	public String savePensioner(ProcessDetails pensioner) {
		ProcessDetails savedPensioner = processRepo.save(pensioner);
		return savedPensioner.getAdhaarNumber();
	}

}
