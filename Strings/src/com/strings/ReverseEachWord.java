package com.strings;

public class ReverseEachWord {

	public static void main(String[] args) {

		 String sentence = "Java is easy";

	        String[] words = sentence.split(" ");

	        String result = "";

	        for (String word : words) {

	            String reverseWord = "";

	            for (int i = word.length() - 1; i >= 0; i--) {
	                reverseWord = reverseWord + word.charAt(i);
	            }

	            result = result + reverseWord + " ";
	        }

	        System.out.println("Original Sentence : " + sentence);
	        System.out.println("Reversed Words    : " + result.trim());

		

	}
}
