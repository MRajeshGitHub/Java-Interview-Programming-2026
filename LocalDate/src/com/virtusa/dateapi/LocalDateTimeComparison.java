package com.virtusa.dateapi;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocalDateTimeComparison {

	public static void main(String[] args) {

		LocalDateTime start = LocalDateTime.of(2026, 8, 12, 9, 30);
		System.out.println(start);

		LocalDateTime end = LocalDateTime.of(2026, 8, 12, 17, 45);
		System.out.println(end);

		LocalDateTime same = LocalDateTime.of(2026, 8, 12, 9, 30);
		System.out.println(same);

		System.out.println("-----------------------");
		// Comparison
		System.out.println("Start before End: " + start.isBefore(end));

		System.out.println("Start after End: " + start.isAfter(end));

		System.out.println("Start equal Same: " + start.isEqual(same));

		System.out.println("-----------------------");
		// Duration
		Duration duration = Duration.between(start, end);

		System.out.println("Duration: " + duration);

		System.out.println("Hours: " + duration.toHours());

		System.out.println("Minutes: " + duration.toMinutes());

		System.out.println("Seconds: " + duration.toSeconds());
	}
}
