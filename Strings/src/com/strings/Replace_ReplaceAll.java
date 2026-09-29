package com.strings;

public class Replace_ReplaceAll {

	public static void main(String[] args) {

		String value = "banana";

		String replace = value.replace('a', 'c');
		System.out.println(value);
		System.out.println(replace);

		System.out.println("=========");

		String value1 = "Java Developer";

		String result = value1.replace("Java", "Spring");

		System.out.println(value1);
		System.out.println(result);

		System.out.println("--------------");

		String value2 = "Java123Spring456";

		String result1 = value2.replaceAll("\\d", " ");

		System.out.println(value2);
		System.out.println(result1);

		System.out.println("--------------");
		String value3 = "Java123Spring456";
		String result4 = value3.replaceAll("\\d+", "");
		System.out.println(result4);

		String value4 = "Java   Spring    Boot";

		String resu = value4.replaceAll("\\s+"," ");
		System.out.println(resu);
		
		String value5 = "Java@123#Spring!";
		String resulst5 = value5.replaceAll("[^0-9]", "");
		System.out.println(resulst5);
	}
}
