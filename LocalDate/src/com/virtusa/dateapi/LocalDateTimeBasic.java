package com.virtusa.dateapi;

import java.time.LocalDateTime;

public class LocalDateTimeBasic {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime);

		System.out.println("Current Date Time: " + dateTime);

		System.out.println("Date: " + dateTime.toLocalDate());

		System.out.println("Time: " + dateTime.toLocalTime());

		System.out.println("Year: " + dateTime.getYear());

		System.out.println("Month: " + dateTime.getMonth());

		System.out.println("Day: " + dateTime.getDayOfMonth());

		System.out.println("Hour: " + dateTime.getHour());

		System.out.println("Minute: " + dateTime.getMinute());

		System.out.println("Second: " + dateTime.getSecond());
	}
}
