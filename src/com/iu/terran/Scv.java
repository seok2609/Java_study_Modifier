package com.iu.terran;

import com.iu.unit.Unit;

public class Scv extends Unit {
	
	
	public void attack() {
		System.out.println("공격...");
	}
	
	//오버라이딩
	public void move() {
		System.out.println("움직임");
	}
	
	public void work() {
		System.out.println("일하기");
	}

}
