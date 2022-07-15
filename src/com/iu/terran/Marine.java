package com.iu.terran;

import com.iu.unit.Attacker;
import com.iu.unit.Unit;

public class Marine extends Unit implements Attacker{
	

	private String weapon;
	
	public Marine() {
		super(30);
		System.out.println("Marine 생성자");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	//오버라이딩
	public void move() {
		super.info();                       //부모의 info();
		System.out.println("뛰어다님");
	}
	//오버라이딩
	public void info() {
		System.out.println("Marine Info");
	}
	
	public void attack() {
		this.shoot();
	}
	
	private void shoot() {
		System.out.println("우다다닫");
	}

}
