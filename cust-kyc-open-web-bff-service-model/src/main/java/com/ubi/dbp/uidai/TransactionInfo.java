package com.ubi.dbp.uidai;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionInfo {
	private String mcc;
	private String posEntryMode;
	private String posCode;
	private String caTid;
	private String caId;
	private String caTa;
}
