package com.strings;

public class TrimStrip {

	public static void main(String[] args) {

		String name = "   Rajesh   ";

		String trimResult = name.trim();
		String stripResult = name.strip();

		System.out.println("Original : [" + name + "]");
		System.out.println("trim()   : [" + trimResult + "]");
		System.out.println("strip()  : [" + stripResult + "]");
	}
}
