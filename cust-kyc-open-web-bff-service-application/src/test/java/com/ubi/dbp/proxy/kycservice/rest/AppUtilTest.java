package com.ubi.dbp.proxy.kycservice.rest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ubi.dbp.kycservice.util.AppUtil;

public class AppUtilTest {

    @Test
    public void testConCatUrl() {
        String url = "http://example.com";
        String path = "/api/v1";
        String endPoint = "/endpoint";

        String expected = "http://example.com/api/v1/endpoint";
        String result = AppUtil.conCatUrl(url, path, endPoint);

        assertEquals(expected, result, "The concatenated URL is incorrect");
    }
}
