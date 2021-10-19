package com.org.fil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.fil.exception.FilBusinessException;
import com.org.fil.model.FormatedData;
import com.org.fil.model.ReqKeyOutPut;
import com.org.fil.util.FilConstants;

@Service
public class FilService {

	@Autowired
	private ReqKeyCallService reqKeyCallService;

	@Autowired
	private FbbService fbbService;

	public int getOperationNumber(int radioOperation) throws FilBusinessException {

		ReqKeyOutPut reqKeyOutPut = reqKeyCallService.fBBLNwInitTransaction("PILOPERATION", 1,
				FilConstants.CSTBBLNWENVDEFAULT, FilConstants.CSTBBLNWERRORDEFAULT);

		int iNWret = reqKeyOutPut.getINWret();
		FilBusinessValidation.validate(iNWret);

		String hBuffer = reqKeyOutPut.getHBuffer();
		iNWret = fbbService.fBBLNwPutNum(hBuffer, "00", 2, 0, false);

		FilBusinessValidation.checkNwOk(iNWret);

		iNWret = fbbService.fBBLNwPutNum(hBuffer, "88", 2, 0, false);

		FilBusinessValidation.checkNwOk(iNWret);

		iNWret = fbbService.fBBLNwExchange(hBuffer);

		FormatedData formatedData = fbbService.fBBLNwgetNum(hBuffer, 1, 0, false, false);
		iNWret = formatedData.getINWret();

		FilBusinessValidation.checkNwOk(iNWret);

		int sValue = Integer.parseInt(formatedData.getSValue());

		FormatedData formatedData2 = fbbService.fBBLNwgetNum(hBuffer, 2, 0, false, false);

		iNWret = formatedData2.getINWret();

		sValue = Integer.parseInt(formatedData2.getSValue());

		FilBusinessValidation.checkNwOk(iNWret);

		FilBusinessValidation.chcekSvalue(sValue);

		int iResult = sValue;

		FormatedData formatedData3 = fbbService.fBBLNwgetNum(hBuffer, 2, 0, false, false);

		iNWret = formatedData3.getINWret();

		FilBusinessValidation.checkNwOk(iNWret);

		sValue = Integer.parseInt(formatedData3.getSValue());

		FilBusinessValidation.chcekSvalue2(sValue);

		int iQuestion = sValue;

		FormatedData formatedData4 = fbbService.fBBLNwgetNum(hBuffer, 2, 0, false, false);

		iNWret = formatedData4.getINWret();

		FilBusinessValidation.checkNwOk(iNWret);
		
		int PILOPEFILE = Integer.parseInt(formatedData4.getSValue().substring(0, 10));

		return PILOPEFILE;

	}

}
