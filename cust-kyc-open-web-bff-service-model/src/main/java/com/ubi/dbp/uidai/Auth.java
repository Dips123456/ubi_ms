package com.ubi.dbp.uidai;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Auth {

	private Uses uses;
	private Meta meta;
	private Skey skey;
	private com.ubi.dbp.uidai.Data data;
	private String encodedHmac;
	private String uid;
	private String rc;
	private String txn;
	private String pidTs;
	private String userName;

}
