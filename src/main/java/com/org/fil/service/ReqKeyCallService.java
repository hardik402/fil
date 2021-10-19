package com.org.fil.service;

import org.springframework.stereotype.Service;

import com.org.fil.model.ReqKeyOutPut;

@Service
public class ReqKeyCallService {
	
	public ReqKeyOutPut fBBLNwInitTransaction(String reqKey, int serviceVersion, int envType,int errorMode) {
		// TODO req key call
		return ReqKeyOutPut.builder().iNWret(calculateInWret()).hBuffer("Output").build();
	}

	private int calculateInWret() {
		// TODO add logic to randomly generate possible values
		return 0;
	}

}
