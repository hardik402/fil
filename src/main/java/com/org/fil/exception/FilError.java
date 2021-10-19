package com.org.fil.exception;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FilError {

	private Integer code;
	
	private String descriptionHeader;
	private String description;
	
}
