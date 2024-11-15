package com.ubi.dbp.kycservice.service;

import com.ubi.dbp.kycservice.model.AadharValidateOtpRequest;
import com.ubi.dbp.kycservice.model.GenerateOTPRequest;
import com.ubi.dbp.kycservice.model.GenerateOTPResponse;
import com.ubi.dbp.kycservice.model.ValidateOTPResponse;

import reactor.core.publisher.Mono;


public interface AadhaarService {
	Mono<GenerateOTPResponse>  generateOTP(GenerateOTPRequest generateOTPRequest);
	Mono<ValidateOTPResponse> validateOTP(AadharValidateOtpRequest validateOTPRequest);
}
