package com.ubi.dbp.kycservice.exception;

import dbp.framework.common.domain.exception.DomainException;

public class EkycException extends DomainException{

	private static final long serialVersionUID = 1L;

	public EkycException(ErrorMessageEnum error) {
		super(error.getCode(), error.getMessage());
	}

	public EkycException(ErrorMessageEnum error, Object... values) {
		super(error.getCode(), String.format(error.getMessage(), values));
	}

}
