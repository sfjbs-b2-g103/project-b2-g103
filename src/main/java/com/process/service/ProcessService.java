package com.process.service;


import com.process.entity.ProcessDetails;


public interface ProcessService {

	public ProcessDetails calulatePensionAmount(ProcessDetails processDetails);

	public String savePensioner(ProcessDetails pensioner);

}
