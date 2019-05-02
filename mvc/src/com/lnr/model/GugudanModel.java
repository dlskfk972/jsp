package com.lnr.model;

public class GugudanModel {
	public String getGuResult(String num) {
		String result = "";
		
		int inum = Integer.parseInt(num);
		
		for(int i=1; i<10; i++) {
			result += inum + " X " + i + " = " + (inum*i) + "<br>";
		}
		
		return result;
	}
}
