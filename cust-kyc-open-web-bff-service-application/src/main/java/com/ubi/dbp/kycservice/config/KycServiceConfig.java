package com.ubi.dbp.kycservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dbp.framework.proxy.common.client.DbpWebClient;
import dbp.framework.proxy.common.client.DbpWebClientImpl;
import lombok.Getter;

@Configuration
@Getter
public class KycServiceConfig {
	@Value("${ekyc.service.proxy.base.url}")
	private String proxySvcBaseUrl;
	@Value("${ekyc.service.proxy.base.path}")
	private String proxySvcBasePath;
	@Value("${ekyc.service.proxy.generateotp}")
	private String generateOtpEndPoint;
	@Value("${ekyc.service.proxy.validateotp}")
	private String validateOtpEndPoint;

	@Bean
	public DbpWebClient dbpWebClient() {
		return new DbpWebClientImpl();
	}

}
