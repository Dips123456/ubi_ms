package com.ubi.dbp.kycservice.model;

import com.ubi.dbp.uidai.UidData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidateOTPResponse {
	private UidData uidData;
	private String respCode;
	private String respDesc;
	private String uidType;
	private String txn;
	private String uidToken;
	private String communicationId;
	private String rrn;
	private String ttl;
	private String panStatus;
	private String isMobileLinked;
	private float score;

}
