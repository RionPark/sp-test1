package com.test.sp1.bean;

public class Dog implements Action {

	@Override
	public void eat() {
		System.out.println("강아지가 밥을 먹어요~");
	}

}
