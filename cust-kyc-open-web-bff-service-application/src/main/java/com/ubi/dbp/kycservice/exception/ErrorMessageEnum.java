package com.ubi.dbp.kycservice.exception;

public enum ErrorMessageEnum {
	UNABLE_TO_PROCESS("UNABLE_TO_PROCESS", "Unable to Process your request"),
	GENERIC_INPUT_ERR("ERR_CU_00100", "Please provide valid input to fetch the details."),
	GENERIC_TECHNICAL_ERR("ERR_CU_00999", "Technical error occurred while processing your request. Kindly try after some time."),
	CUST_KYC_NOT_INIT("ERR_KY_00100", "Customer kyc not initialized (empty)."),
	CUST_NOT_FOUND("ERR_CU_00121", "Customer not found or invalid."),
	FAILED_TO_UPDATE("ERR_CU_00122" ,"Failed to update Rekyc and send SMS"),
	PAN_NOT_ACTIVE("ERR_CU_00124", "Active PAN not linked to your account, please visit your branch to update."),
	MOB_NO_NOT_LINKED_TO_AADHAR("ERR_CU_00122", "Your mobile no. is not linked to your Aadhar,please visit your branch to update."),
	NAME_MISMATCH_AADHAR_NAME("ERR_CU_00123", "Your name mismatch in bank and Aadhar website,please visit your branch to update."),
	AADHAAR_OTP_FAILED("ERR_CU_00124","Technical error occurred while processing your otp for AADHAAR Service. Kindly try after some time."),
	CASA_ACCT_NOT_FOUND("ERR_AC_00122", "CASA acct not found or invalid."),
	CBS_ERROR("CBS_ERROR","We are unable to process your request at the moment, try again later"),
	CUST_KYC_INVALID_PAN("ERR_KY_00101", "PAN is not linked to your account, please update through VKYC or visit your branch"),
	CUST_KYC_INVALID_NATIONAL_ID("CUST_KYC_INVALID_NATIONAL_ID", "Aadhar number is not linked to your account, please update through VKYC or visit your branch"),
	CUST_KYC_NOT_AVAILABLE("ERR_KY_00101", "Please update your KYC at the branch before proceeding with the application."),
	CUST_INVALID_NATIONAL_ID("ERR_KY_00102", "Aadhar number is not linked to your account, please update through VKYC or visit your branch."),
	CUST_INVALID_MOBILE_NUMBER("ERR_KY_00103","Mobile number is not linked to your account, please update through VKYC or visit your branch."),
	CUST_KYC_VALIDITY_EXPIRED("ERR_KY_00100", "Please update your KYC at the branch before proceeding with the application."),
	CUST_KYC_VALIDITY_EXPIRY_DATE_NOT_AVAIL("ERR_KY_00100", "Please update your KYC at the branch before proceeding with the application.");
	
	private final String code;
	private final String message;

	ErrorMessageEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return code + ": " + message;
	}

}
