package com.virtusa.dateapi;

import java.time.LocalDate;

public class LocalDateComparison {

	public static void main(String[] args) {

		// different dates

		LocalDate date1 = LocalDate.of(2025, 8, 10);
		LocalDate date2 = LocalDate.of(2025, 8, 15);
		LocalDate date3 = LocalDate.of(2025, 8, 10);

		// before date

		System.out.println("date1 before date2 is : " + date1.isBefore(date2));// true

		// After data
		System.out.println("Date1 after date 3 is : " + date1.isAfter(date3));// false

		// equal date
		System.out.println("date 1 is equal date 2 is :" + date1.isEqual(date2));//false
	}
}
