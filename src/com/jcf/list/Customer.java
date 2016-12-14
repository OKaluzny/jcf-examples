package com.jcf.list;

import java.util.ArrayList;

public class Customer {

	private Customer(String a, String b) {
	}

	public static void main(String[] args) {
	
		ArrayList customers = new ArrayList();
		
		customers.add(new Customer ("Lee","David"));
		customers.add(new Customer ("Soloff","Jack"));
		
		customers.forEach(s-> System.out.println(s.toString()));
		
		System.out.println(customers.size());
	}
}
