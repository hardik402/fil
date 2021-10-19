package com.org.fil.service;

import org.springframework.stereotype.Service;

import com.org.fil.model.FormatedData;

@Service
public class FbbService {

	
	public int fBBLNwPutNum(String buffer, String numberToFormat, int wholeLength, int decimalLength, Boolean isNumbersigned) {
		//TODO implementation to be identified
		return 0;
	}
	
	public int 	fBBLNwExchange(String buffer) {
		//TODO implementation to be identified
		return 0;
	}
	
	public FormatedData fBBLNwgetNum(String buffer,int wholeLength, int decimalLength,Boolean isNumbersigned, Boolean nonBlank) {
		//TODO implementation to be identified
		return FormatedData.builder().iNWret(0).sValue("1234567899").build();
	}
}
