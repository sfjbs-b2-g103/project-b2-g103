package com.pensionDetail.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pensionDetail.entity.PensionDetails;
import com.pensionDetail.service.PensionService;



@RestController
public class PensionController {
	@Autowired
	PensionService pensionService;
	
	@GetMapping("/welcome")
	public String Ordermanagement() {
		return "hello this is for pensioners only";
	}
	@PostMapping("/details")
	Integer createOrder (@RequestBody PensionDetails detail) {
		Integer aadhar =pensionService.saveDetail(detail);
		System.out.println(aadhar);
		return aadhar;
	}
	@GetMapping("/Detail/{aadhar}")
	public Optional<PensionDetails> getDetail(@PathVariable Integer aadhar)
	{
		Optional<PensionDetails> detail = pensionService.getDetail(aadhar);
		return detail;
	}
	
	@GetMapping("/allDetails")
	public List<PensionDetails> getDetail(){
		return pensionService.getALLDetails();
	}
	
	@DeleteMapping("/detail/{aadhar}")
	public ResponseEntity<PensionDetails> deleteDetail(@PathVariable Integer aadhar){
		System.out.println(aadhar);
		ResponseEntity<PensionDetails> responseEntity = new ResponseEntity<PensionDetails>(HttpStatus.OK);
		try {
			pensionService.deleteDetail(aadhar);
		}
			catch (Exception e) {
				e.printStackTrace();
				responseEntity =new ResponseEntity<PensionDetails>(HttpStatus.NOT_FOUND);
			}
			return responseEntity;
	}
	@PutMapping("/updateDetail/{aadhar}")
	public ResponseEntity<PensionDetails> updateDetail(@PathVariable Integer aadhar, @RequestBody PensionDetails detail  ){
	ResponseEntity<PensionDetails> pensionDetailEntity = new ResponseEntity<>(HttpStatus.OK);
	try {
		pensionService.updateDetail(detail, aadhar);
	}
		catch (Exception e) {
			e.printStackTrace();
			pensionDetailEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
	 return pensionDetailEntity;
	}
	
	

}
