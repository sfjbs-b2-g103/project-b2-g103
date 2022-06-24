package com.process.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.process.entity.ProcessDetails;
import com.process.service.ProcessService;


@RestController
public class ProcessController {
	
	@Autowired
	private ProcessService processService;
	
	@PostMapping("/processPensionInput")
	String createPensioner(@RequestBody ProcessDetails pensioner) {
		
		String adhaarNumber = processService.savePensioner(pensioner);
		return adhaarNumber;
	}

	
}
