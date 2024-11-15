package com.ubi.dbp.uidai;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meta {

	private String rdsId;
	private String rdsVer;
	private String dpId;
	private String dc;
	private String mi;
	private String mc;
}
