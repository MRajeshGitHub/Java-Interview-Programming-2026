package com.virtusa.dateapi;

import java.time.LocalDateTime;

public class LocalDateTimeModification {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.of(2026, 8, 12, 10, 30, 45);

		System.out.println(dateTime);

		// days
		LocalDateTime after5Days = dateTime.plusDays(5);

		System.out.println("After 5 Days: " + after5Days);

		// Subtract
		LocalDateTime before3Days = dateTime.minusDays(3);

		System.out.println("Before 3 Days: " + before3Days);

		// months
		LocalDateTime after2Months = dateTime.plusMonths(2);

		System.out.println("After 2 Months: " + after2Months);

		// hours
		LocalDateTime after4Hours = dateTime.plusHours(4);

		System.out.println("After 4 Hours: " + after4Hours);

		// Subtract
		LocalDateTime before20Minutes = dateTime.minusMinutes(20);

		System.out.println("Before 20 Minutes: " + before20Minutes);

		// seconds
		LocalDateTime after30Seconds = dateTime.plusSeconds(30);

		System.out.println("After 30 Seconds: " + after30Seconds);
	}
}
