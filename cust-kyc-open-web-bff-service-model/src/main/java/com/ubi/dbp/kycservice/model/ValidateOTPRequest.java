package com.ubi.dbp.kycservice.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidateOTPRequest {
	private String otp;
	private String uid;
	private String rc;
	private String txn;
	private String cif;
	private String pan;
	private String mobile;
	private LocalDate dob;
	private String name;
}
