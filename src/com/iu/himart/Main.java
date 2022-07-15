package com.iu.himart;

public class Main {
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Tv tv = new Tv();
		Phone phone = new Phone();
		
		System.out.println("=========컴퓨터==========");
		computer.info();
		System.out.println("==========T v==========");
		tv.info();
		System.out.println("=========핸드폰==========");
		phone.info();
		
		Client client = new Client();
		client.buy(computer);
		client.buy(phone);
		client.buy(tv);
	}

}
