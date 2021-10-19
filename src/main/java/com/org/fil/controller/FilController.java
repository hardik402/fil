package com.org.fil.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.fil.exception.FilBusinessException;
import com.org.fil.service.FilService;
import com.org.fil.util.CommonUtil;

@RestController
@RequestMapping("/fil")
public class FilController {
	
	@Autowired
	private FilService filService;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/getOperation/{id}")
	public Response getOperationNumber(@PathVariable("id") int id ) throws FilBusinessException {
		try {
			return Response.ok(filService.getOperationNumber(id)).build();
		}
		catch(FilBusinessException e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(
					CommonUtil.getFilErrorResponse(Status.BAD_REQUEST,e.getError().getDescription(), e.getError().getDescriptionHeader()))
					.build();
		}
		
		
	}

}
