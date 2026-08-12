package com.virtusa.dateapi;

import java.time.Duration;
import java.time.Instant;

public class InstantDuration {

	public static void main(String[] args) {

		// Start time
		Instant start = Instant.now();
		System.out.println(start);// 2026-08-12T13:38:37.632618Z

		// Simulate some processing
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		// End time
		Instant end = Instant.now();

		System.out.println("End Time: " + end);

		// Calculate duration
		Duration duration = Duration.between(start, end);

		System.out.println("Processing Time in Seconds: " + duration.toSeconds());

		System.out.println("Processing Time in Milliseconds: " + duration.toMillis());

	}
}
