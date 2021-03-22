package com.test.sp1.bean;

public class Cat implements Action {

	@Override
	public void eat() {
		System.out.println("고양이가 밥을 먹어요~");
	}

}
