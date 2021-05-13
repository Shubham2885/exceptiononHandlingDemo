package com.bz.eh;

import java.util.List;

public class MyExecption extends Exception{

	private String message;
	private List<String> list;
	private int status;
	
	public MyExecption(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
