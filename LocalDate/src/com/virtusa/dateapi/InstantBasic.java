package com.virtusa.dateapi;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantBasic {

	public static void main(String[] args) {

		Instant currentInstant = Instant.now();

		System.out.println(currentInstant);// 2026-08-12T13:25:36.514015700Z

		System.out.println("------------------------------------");
		System.out.println("Current Instant: " + currentInstant);

		System.out.println("------------------------------------");
		System.out.println("Epoch Seconds: " + currentInstant.getEpochSecond());
		System.out.println("------------------------------------");

		System.out.println("Epoch Milliseconds: " + currentInstant.toEpochMilli());

		System.out.println("------------------------------------");
		ZonedDateTime dateTime = currentInstant.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println(dateTime);

	}

}
