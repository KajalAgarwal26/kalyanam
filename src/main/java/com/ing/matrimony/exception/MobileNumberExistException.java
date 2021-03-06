package com.ing.matrimony.exception;

import java.io.Serializable;

public class MobileNumberExistException extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "Mobile number already exist...";

	public MobileNumberExistException() {
		super(MESSAGE);
	}

}
