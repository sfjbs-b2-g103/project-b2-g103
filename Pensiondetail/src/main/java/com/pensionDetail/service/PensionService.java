package com.pensionDetail.service;



import java.util.List;
import java.util.Optional;

import com.pensionDetail.entity.PensionDetails;


public interface PensionService {
Integer saveDetail(PensionDetails detail);
Optional<PensionDetails> getDetail(Integer aadhar);

public List<PensionDetails> getALLDetails();

public void deleteDetail(Integer aadhar);

Integer updateDetail(PensionDetails detail, Integer aadhar);
}
