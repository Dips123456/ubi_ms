package com.ubi.dbp.uidai;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtpData {
	private String uid;
	private String channel;
	private String consent;
	private String communicationId;
	private String ts;
}
