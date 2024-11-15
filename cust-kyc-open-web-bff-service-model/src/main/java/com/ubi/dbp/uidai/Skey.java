package com.ubi.dbp.uidai;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skey {

	private String ci;
	private String encodedSk;
}
