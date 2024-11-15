package com.ubi.dbp.kycservice.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.ubi.dbp.kycservice.config.KycServiceConfig;
import com.ubi.dbp.kycservice.model.AadharValidateOtpRequest;
import com.ubi.dbp.kycservice.model.GenerateOTPRequest;
import com.ubi.dbp.kycservice.model.GenerateOTPResponse;
import com.ubi.dbp.kycservice.model.ValidateOTPResponse;
import com.ubi.dbp.kycservice.util.AppUtil;

import dbp.framework.proxy.common.client.DbpWebClient;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class AadharMicroserviceClient {
	@Autowired
	DbpWebClient dbpWebClient;
	@Autowired
	KycServiceConfig kycServiceConfig;
	
	Map<String, String> headerMap = Map.of(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
	Map<String, String> paramPathMap = new HashMap<>();
	
	
	public Mono<GenerateOTPResponse> generateOtpRequestHandler(GenerateOTPRequest generateOtpRequest) throws Exception{
		String generateOtpUrl=AppUtil.conCatUrl(kycServiceConfig.getProxySvcBaseUrl(), kycServiceConfig.getProxySvcBasePath(), kycServiceConfig.getGenerateOtpEndPoint());
		log.info("generateOtpUrl {}",generateOtpUrl);
		return dbpWebClient.handlePostRequest(generateOtpRequest, generateOtpUrl, paramPathMap, headerMap, GenerateOTPResponse.class);
	}
	
	public Mono<ValidateOTPResponse> validateOtpRequestHandler(AadharValidateOtpRequest validateOtpRequest) throws Exception{
		String validateOtpUrl=AppUtil.conCatUrl(kycServiceConfig.getProxySvcBaseUrl(), kycServiceConfig.getProxySvcBasePath(), kycServiceConfig.getValidateOtpEndPoint());
		log.info("validateOtpUrl {}", validateOtpUrl);
		return dbpWebClient.handlePostRequest(validateOtpRequest, validateOtpUrl, paramPathMap, headerMap, ValidateOTPResponse.class);
	}
}
