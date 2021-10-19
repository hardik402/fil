package com.org.fil.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FilErrorResponse {

	private FilError filError;
}
