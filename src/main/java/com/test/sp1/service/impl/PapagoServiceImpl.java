package com.test.sp1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp1.api.PapagoAPI;
import com.test.sp1.entity.papago.PaPagoParam;
import com.test.sp1.entity.papago.PaPagoResult;
import com.test.sp1.service.PapagoService;

@Service
public class PapagoServiceImpl implements PapagoService {

	@Autowired
	private PapagoAPI papagoAPI;
	
	@Override
	public PaPagoResult getPaPagoResult(PaPagoParam pp) {
		return papagoAPI.getResult(pp);
	}

}
