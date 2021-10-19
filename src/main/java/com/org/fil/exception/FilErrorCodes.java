package com.org.fil.exception;

import javax.ws.rs.core.Response;

import com.org.fil.util.FilConstants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static javax.ws.rs.core.Response.Status.*;

@Getter
@AllArgsConstructor
public enum FilErrorCodes {
	

    //Http error codes
    FIL_BUSINESS_EXCEPTION(FilConstants.HTTP_500, INTERNAL_SERVER_ERROR, "Recherche en SIL","Erreur lors de l'initialisation de la transaction. Veuillez réessayer dans quelques instants."),
    FIL_BUSINESS_EXCEPTION_SVALUE(FilConstants.HTTP_500, INTERNAL_SERVER_ERROR, "Erreur","ca marche pas sur result "),
    FIL_BUSINESS_EXCEPTION_SVALUE2(FilConstants.HTTP_500, INTERNAL_SERVER_ERROR, "Erreur sValue ","ca marche pas sur question"),
    FIL_BUSINESS_EXCEPTION_FBBLNWEXCHANGE(FilConstants.HTTP_500, INTERNAL_SERVER_ERROR, "Recherche en SIL","Erreur lors de la transaction. Veuillez réessayer dans quelques instants."),
    FIL_UNAUTHORIZED_EXCEPTION(FilConstants.HTTP_401, UNAUTHORIZED, "","Sorry ! You do not have sufficient rights  to access this service"),
    FIL_BAD_REQUEST_EXCEPTION(FilConstants.HTTP_400, BAD_REQUEST, "","Invalid Input or mandatory input parameter(s) missing."),
    FIL_FORBIDDEN_EXCEPTION(FilConstants.HTTP_403, FORBIDDEN, "","Forbidden access."),
    FIL_NOT_FOUND_EXCEPTION(FilConstants.HTTP_404, NOT_FOUND, "","Not Found.");


	private final Integer code;
	private final Response.Status status;
	private final String descriptionHeader;
	private final String description;

}
