package com.ubi.dbp.kycservice.util;

public class AppUtil {

	public static String conCatUrl(String url, String path, String endPoint) {
		StringBuffer sb = new StringBuffer();
		sb.append(url);
		sb.append(path);
		sb.append(endPoint);
		return sb.toString();
	}
}
