package com.org.fil.util;

import javax.ws.rs.core.Response;

import com.org.fil.exception.FilError;
import com.org.fil.exception.FilErrorResponse;

public class CommonUtil {

	public static FilErrorResponse getFilErrorResponse(Response.Status status, String descriptionHeader, String description) {
		return FilErrorResponse.builder().filError(FilError.builder().code(status.getStatusCode())
				.description(description).descriptionHeader(descriptionHeader).build()).build();

	}

}
