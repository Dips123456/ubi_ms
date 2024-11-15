package com.ubi.dbp.kycservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubi.dbp.kycservice.client.AadharMicroserviceClient;
import com.ubi.dbp.kycservice.model.AadharValidateOtpRequest;
import com.ubi.dbp.kycservice.model.GenerateOTPRequest;
import com.ubi.dbp.kycservice.model.GenerateOTPResponse;
import com.ubi.dbp.kycservice.model.ValidateOTPResponse;
import com.ubi.dbp.kycservice.service.AadhaarService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class AadhaarServiceImpl implements AadhaarService {
	private AadharMicroserviceClient aadharMicroserviceClient;

	public AadhaarServiceImpl(AadharMicroserviceClient aadharMicroserviceClient) {
		super();
		this.aadharMicroserviceClient = aadharMicroserviceClient;
	}

	@Override
	public Mono<GenerateOTPResponse> generateOTP(GenerateOTPRequest generateOTPRequest) {
		try {
			return aadharMicroserviceClient.generateOtpRequestHandler(generateOTPRequest);
		} catch (Exception e) {
			log.error("error occerd {}", e.getMessage());
		}
		return Mono.empty();
	}

	public Mono<ValidateOTPResponse> validateOTP(AadharValidateOtpRequest validateOTPRequest) {
		try {
			return aadharMicroserviceClient.validateOtpRequestHandler(validateOTPRequest);
		} catch (Exception e) {
			log.error("error occerd {}", e.getMessage());
		}
		return Mono.empty();
	}
}