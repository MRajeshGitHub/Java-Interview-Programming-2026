package com.virtusa.dateapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExm {

	public static void main(String[] args) {

		// local date
		LocalDate date = LocalDate.of(2020, 7, 21);
		// DateTimeformatter
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String format = date.format(dateTimeFormatter);
		System.out.println(format);

		System.out.println("Original Date: " + date);
		System.out.println("Formatted Date: " + dateTimeFormatter);
	}
}
