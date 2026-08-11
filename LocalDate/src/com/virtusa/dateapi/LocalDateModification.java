package com.virtusa.dateapi;

import java.time.LocalDate;

public class LocalDateModification {

	public static void main(String[] args) {

		// specific data

		LocalDate date = LocalDate.of(2023, 8, 12);
		System.out.println(date);

		// add days in date

		System.out.println(date.plusDays(11));

		// subtract data
		System.out.println(date.minusDays(5));

		// add month

		System.out.println(date.plusMonths(3));

		// subtract month

		System.out.println(date.minusMonths(6));
		// Subtract years
		System.out.println(date.minusYears(2));
	}
}
