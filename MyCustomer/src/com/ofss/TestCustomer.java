package com.ofss;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1=new Address(112,"MG ROAD","Banglore",560055);
		Customer c1 = new Customer("Saurabh",a1);
		System.out.println(c1);
	}

}
