package com.ubi.dbp.uidai;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KycReqInfo {

	private Auth auth;
	private String pfr;
	//private String txn;
	//private String communicationId;
}
