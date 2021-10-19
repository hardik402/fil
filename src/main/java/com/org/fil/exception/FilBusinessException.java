package com.org.fil.exception;

import lombok.Getter;

@SuppressWarnings("serial")
@Getter
public class FilBusinessException extends Exception{
	
	
	private final FilErrorCodes error;
	private final Integer errorCode;
	
	public FilBusinessException(FilErrorCodes error) {
		super(error.getDescription());
		this.error = error;
		this.errorCode = null;
	}
	
	public FilBusinessException(int statusCode, String errorMessage) {
    	//errorMessage: this message is exposed to client.
        super(errorMessage);
        this.errorCode = statusCode;
        this.error = null;
    }

}
