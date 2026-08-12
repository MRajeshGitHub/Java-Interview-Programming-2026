package com.virtusa.dateapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeBasic {

	public static void main(String[] args) {

		// India Time
		ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(indiaTime);
		System.out.println("--------------------------------");

		// New York Time
		ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

		System.out.println(newYorkTime);
		System.out.println("--------------------------------");

		// London Time
		ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonTime);
		System.out.println("--------------------------------");

		// Zone Conversion

		ZonedDateTime newYorkTime1 = indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));

		System.out.println("India: " + indiaTime);
		System.out.println("--------------------------");
		System.out.println("newYorkTime : " + newYorkTime1);
	}
}
