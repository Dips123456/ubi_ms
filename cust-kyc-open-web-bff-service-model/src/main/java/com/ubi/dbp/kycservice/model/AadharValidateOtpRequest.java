package com.ubi.dbp.kycservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AadharValidateOtpRequest {
	private String otp;
	private String uid;
	private String rc;
	private String txn;
	private String communicationId;
}