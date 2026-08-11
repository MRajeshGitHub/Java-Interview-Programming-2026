package com.virtusa.dateapi;

import java.time.LocalDate;

public class LocalDateBasic {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		//System.out.println(date);

		System.out.println("Today's Date: " + date);

		System.out.println("Year: " + date.getYear());

		System.out.println("Month: " + date.getMonth());

		System.out.println("Month Number: " + date.getMonthValue());

		System.out.println("Day: " + date.getDayOfMonth());

		System.out.println("Day of Week: " + date.getDayOfWeek());

		System.out.println("Day of Year: " + date.getDayOfYear());
	}
}
