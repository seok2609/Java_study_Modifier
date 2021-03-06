package com.iu.animal;

public class Zoo {
	
	//멤버변수
	//접근지정자 [그외지정자] 데이터타입 변수명;
	
	//클래스변수
	public static String title = "사파리";   //static 뒤 변수명은 title과 같이 기울어짐 static은 공유형
	//인스턴스 변수
	public final int PRICE = 50000;    		//MAX_VALUE
											// final을 사용하면 더이상 값 변경 불가능
	public int price;
	
	
	//멤버메서드 선언
	//접근지정자 [그외지정자] 리턴타입 메서드명[(매개변수 선언)] {}
	
	//클래스 메서드
	public static void info() {
		System.out.println("Static Method");
		System.out.println(Zoo.title);
//		System.out.println(price);
	}
	
	//인스턴스메서드
	public void getPrice() {
		System.out.println(price);
		System.out.println(Zoo.title);
		Zoo.info();
	}
	
}
