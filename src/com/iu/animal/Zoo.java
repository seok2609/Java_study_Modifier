package com.iu.animal;

public class Zoo {
	
	//멤버변수
	//접근지정자 [그외지정자] 데이터타입 변수명;
	
	public static String title = "사파리";   //static 뒤 변수명은 title과 같이 기울어짐
	
	//멤버메서드 선언
	//접근지정자 [그외지정자] 리턴타입 메서드명[(매개변수 선언)] {}
	public static void info() {
		System.out.println("Static Method");
	}
	
}
