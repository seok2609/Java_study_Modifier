package com.iu.himart;

public class Computer extends Same{
	
	public String cpu;
	
	public Computer() {
		this.cpu="intel i5-11";
		this.setBrand("Lg gram");
		this.setPrice(2000000);
		this.setPoint(100);
	}
	
		public void info() {
			super.info();
			System.out.println("Cpu : " + this.getCpu());
		}


	
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
}
