package com.ubi.dbp.kycservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenerateOTPResponse {
	private String respCode;
	private String respDesc;
	private String aadhaarId;
	private String communicationId;
	private String uidaiAuthCode;
	private String uidType;
	private String txn;
	
}
