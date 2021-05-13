package com.bz.eh;

public class ThrowDemo {

	public void checkAge(int age) throws MyExecption {
		if(age<18) {
			age = age/0;
			throw new MyExecption("Student is not eligible");
		}else {
			System.out.println("Student is eligible");
		}
	}
	
	public static void main(String[] args) {
		
		ThrowDemo demo = new ThrowDemo();
		
		try {
			demo.checkAge(13);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
