package com.strings;

public class VowelConsonantCount {

	public static void main(String[] args) {

		String str = "Varanasi";

		int vcount = 0, concount = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vcount++;
				concount++;
			}
		}

		System.out.println("Vowel count " + vcount);
		System.out.println("Consonent count " + concount);
	}
}
