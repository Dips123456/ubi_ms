package com.ubi.dbp.kycservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubi.dbp.kycservice.model.AadharValidateOtpRequest;
import com.ubi.dbp.kycservice.model.GenerateOTPRequest;
import com.ubi.dbp.kycservice.model.GenerateOTPResponse;
import com.ubi.dbp.kycservice.model.ValidateOTPRequest;
import com.ubi.dbp.kycservice.model.ValidateOTPResponse;
import com.ubi.dbp.kycservice.service.AadhaarService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/kyc/", produces = MediaType.APPLICATION_JSON_VALUE)
public class AadharController {

	private AadhaarService aadhaarService;

	public AadharController(AadhaarService aadhaarService) {
		this.aadhaarService = aadhaarService;
	}

	@PostMapping("/generateOtp")
	public Mono<GenerateOTPResponse> generateOTP(@RequestBody GenerateOTPRequest generateOTPRequest) {
		return aadhaarService.generateOTP(generateOTPRequest);
	}

	@PostMapping("/validateOtp")
	public Mono<ValidateOTPResponse> validateOTP(@RequestBody AadharValidateOtpRequest aadharValidateOtpRequest) {
		return aadhaarService.validateOTP(aadharValidateOtpRequest);
	}
	
	@PostMapping("/validateOtpAndCustomerDetails")
	public Mono<ValidateOTPResponse> validateOtpAndCustomerDetails(@RequestBody ValidateOTPRequest validateOTPRequest) {
		log.info("validateOTPRequest {} ", validateOTPRequest);
		return null;
		
	}
}
	