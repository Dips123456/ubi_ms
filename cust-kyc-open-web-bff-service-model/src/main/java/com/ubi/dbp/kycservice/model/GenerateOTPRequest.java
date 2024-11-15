package com.ubi.dbp.kycservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenerateOTPRequest {
	private String vid;
	private String channel;
	private String consent;
	private String communicationId;
	
}
