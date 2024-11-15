package com.ubi.dbp.uidai;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UidData {
	private Poi poi;
	private Poa poa;
	private String[] pht;
	private EPrn prn;
	private String uid;

}
