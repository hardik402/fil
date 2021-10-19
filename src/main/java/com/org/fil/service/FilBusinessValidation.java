package com.org.fil.service;

import com.org.fil.exception.FilBusinessException;
import com.org.fil.exception.FilErrorCodes;
import com.org.fil.util.FilConstants;

public class FilBusinessValidation {

	public static void validate(int iNWret) throws FilBusinessException {
		if (iNWret != FilConstants.CSTBBLNWOK) {
			throw new FilBusinessException(FilErrorCodes.FIL_BUSINESS_EXCEPTION);
		}
	}

	public static void validateFBBLNwExchange(int iNWret) throws FilBusinessException {
		if (iNWret != FilConstants.CSTBBLNWOK) {
			throw new FilBusinessException(FilErrorCodes.FIL_BUSINESS_EXCEPTION);
		}
	}
	
	public static void checkNwOk(int iNWret) {
		if (iNWret != FilConstants.CSTBBLNWOK) {
			// return 0;
		}
	}
	
	public static void chcekSvalue(int sValue) throws FilBusinessException {
		if(sValue!= FilConstants.CSTBBLNWOK) {
			throw new FilBusinessException(FilErrorCodes.FIL_BUSINESS_EXCEPTION_SVALUE);
		}
	}

	public static void chcekSvalue2(int sValue) throws FilBusinessException {
		if(sValue!= 88) {
			throw new FilBusinessException(FilErrorCodes.FIL_BUSINESS_EXCEPTION_SVALUE2);
		}
		
	}
	
}
