package com.test.sp1.entity.papago;

import lombok.Data;

@Data
public class PaPagoParam {
	private String source;
	private String target;
	private String text;
	private boolean honorific;
}
