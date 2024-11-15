package com.ubi.dbp.kycservice.exception;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import dbp.framework.common.domain.exception.DomainException;

public class CustomerException extends DomainException {
	private static final long serialVersionUID = -8004702236911760231L;

	public CustomerException(ErrorMessageEnum error) {
		super(error.getCode(), error.getMessage());
	}

	public CustomerException(ErrorMessageEnum error, Object... values) {
		super(error.getCode(), String.format(error.getMessage(), values));
	}

	public CustomerException(ErrorMessageEnum error, String[] values, Map<String, String> intErrors) {
		super(error.getCode(), error.getMessage(), values, intErrors);
	}

	public CustomerException(ErrorMessageEnum error, String[] values) {
		super(error.getCode(), error.getMessage(), values);
	}

	public CustomerException(ErrorMessageEnum error, String[] values, List<ErrorMessageEnum> intError) {
		super(error.getCode(), error.getMessage(), values,
				intError.stream().collect(Collectors.toMap(ErrorMessageEnum::getCode, ErrorMessageEnum::getMessage)));
	}

	public CustomerException(ErrorMessageEnum error, String[] values, ErrorMessageEnum intError) {
		super(error.getCode(), error.getMessage(), values, Map.of(intError.getCode(), intError.getMessage()));
	}
}