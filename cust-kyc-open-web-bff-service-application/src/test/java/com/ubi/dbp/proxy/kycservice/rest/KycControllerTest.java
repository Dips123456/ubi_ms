//package com.ubi.dbp.proxy.kycservice.rest;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.reactive.server.WebTestClient.bindToController;
//
//import java.io.IOException;
//
//import javax.net.ssl.SSLException;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.reactive.server.WebTestClient;
//
//import com.ubi.dbp.proxy.kycservice.config.KycServiceConfig;
//import com.ubi.dbp.proxy.kycservice.request.AadhaarMobilelinkRequest;
//import com.ubi.dbp.proxy.kycservice.request.NameSimilarityRequest;
//import com.ubi.dbp.proxy.kycservice.request.PanStatusCheckRequest;
//import com.ubi.dbp.proxy.kycservice.response.AadhaarMobilelinkResponse;
//import com.ubi.dbp.proxy.kycservice.response.NameSimilarityResponse;
//import com.ubi.dbp.proxy.kycservice.response.PanStatusCheckResponse;
//
//import okhttp3.mockwebserver.MockResponse;
//import okhttp3.mockwebserver.MockWebServer;
//import reactor.core.publisher.Mono;
//
//public class KycControllerTest {
//
//	private WebTestClient webTestClient;
//
//	@Mock
//	private KycServiceConfig kycServiceConfig;
//
//	@InjectMocks
//	private KycController kycController;
//
//	private MockWebServer mockWebServer;
//
//	@BeforeEach
//	void setUp() throws SSLException, IOException {
//		MockitoAnnotations.initMocks(this);
//
//		mockWebServer = new MockWebServer();
//		mockWebServer.start();
//
//		when(kycServiceConfig.getTotalkycSvcBaseUrl()).thenReturn(mockWebServer.url("/").toString());
//		when(kycServiceConfig.getXKarzaKey()).thenReturn("dummy-key");
//
//		//kycController = new KycController(WebClient.builder(), kycServiceConfig);
//		webTestClient = bindToController(kycController).build();
//	}
//
//	@Test
//	void testGetPanStatus() {
//		PanStatusCheckRequest request = new PanStatusCheckRequest();
//		PanStatusCheckResponse response = new PanStatusCheckResponse();
//
//		mockWebServer.enqueue(new MockResponse().setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//				.setBody("{ \"status\": \"success\" }"));
//
//		webTestClient.post().uri("/proxy/kyc/v1/panStatus").contentType(MediaType.APPLICATION_JSON)
////				.body(Mono.just(request), PanStatusCheckRequest.class).exchange().expectStatus().isOk()
//				.expectBody(PanStatusCheckResponse.class).isEqualTo(response);
//	}
//
//	@Test
//	void testNameSimilarity() {
//		NameSimilarityRequest request = new NameSimilarityRequest();
//		NameSimilarityResponse response = new NameSimilarityResponse();
//
//		mockWebServer.enqueue(new MockResponse().setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//				.setBody("{ \"similarity\": 0.9 }"));
//
//		webTestClient.post().uri("/proxy/kyc/v1/nameSimilarity").contentType(MediaType.APPLICATION_JSON)
//				.body(Mono.just(request), NameSimilarityRequest.class).exchange().expectStatus().isOk()
//				.expectBody(NameSimilarityResponse.class).isEqualTo(response);
//	}
//
//	@Test
//	void testAadhaarMobileLink() {
//		AadhaarMobilelinkRequest request = new AadhaarMobilelinkRequest();
//		AadhaarMobilelinkResponse response = new AadhaarMobilelinkResponse();
//
//		mockWebServer.enqueue(new MockResponse().setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//				.setBody("{ \"status\": \"linked\" }"));
//
//		webTestClient.post().uri("/proxy/kyc/v1/aadhaar-mobilelink").contentType(MediaType.APPLICATION_JSON)
//				.body(Mono.just(request), AadhaarMobilelinkRequest.class).exchange().expectStatus().isOk()
//				.expectBody(AadhaarMobilelinkResponse.class).isEqualTo(response);
//	}
//
//	@Test
//	void testInitialization() throws SSLException {
//		assertNotNull(kycController);
//
//	}
//
//}