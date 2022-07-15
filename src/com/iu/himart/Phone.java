package com.iu.himart;

public class Phone extends Same {
	
	public String company;
	
	//생성자 값 초기화
	public Phone() {
		this.setCompany("Apple");
		this.setBrand("Iphone 14");
		this.setPrice(500000);
		this.setPoint(50);
	}

	public void info() {
		super.info();
		System.out.println("Company : " + this.getCompany());
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
