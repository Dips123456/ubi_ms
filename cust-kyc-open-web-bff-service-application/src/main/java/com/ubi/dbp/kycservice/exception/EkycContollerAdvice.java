package com.ubi.dbp.kycservice.exception;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import dbp.framework.support.exception.ErrorMessage;
import dbp.framework.support.exception.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestControllerAdvice
@Slf4j
public class EkycContollerAdvice {
	@Value("${spring.application.name}")
	private String appName;

	@ResponseBody
	@ExceptionHandler(EkycException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Mono<ErrorResponse> handleEkycException(EkycException exception) {
		String uid = UUID.randomUUID().toString();
		log.error("Ekyc Error occurred : ", exception);
		return Mono
				.fromSupplier(
						() -> ErrorResponse.builder().errorId(uid).errorAt(LocalDateTime.now()).errorLocation(appName)
								.errors(Collections.singletonList(ErrorMessage.builder().code(exception.getCode())
										.message(exception.getMessage()).errors(exception.getIntErrors()).build()))
								.build());
	}

	@ResponseBody
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Mono<ErrorResponse> handleException(Exception exception) {
		String uid = UUID.randomUUID().toString();
		log.error("Error occurred : ", exception);
		return Mono.fromSupplier(() -> ErrorResponse.builder().errorId(uid).errorAt(LocalDateTime.now())
				.errorLocation(appName)
				.errors(Collections.singletonList(ErrorMessage.builder()
						.code(ErrorMessageEnum.UNABLE_TO_PROCESS.getCode())
						.message(ErrorMessageEnum.UNABLE_TO_PROCESS.getMessage())
						.errors(Map.of(ErrorMessageEnum.UNABLE_TO_PROCESS.getCode(), exception.getMessage())).build()))
				.build());
	}

}
