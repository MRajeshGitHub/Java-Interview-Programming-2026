package com.virtusa.dateapi;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDuration {

	public static void main(String[] args) {

		LocalTime startTime = LocalTime.of(9, 30);

		LocalTime endTime = LocalTime.of(17, 30);

		Duration duration = Duration.between(startTime, endTime);

		System.out.println("Duration betwee Start and end time is : " + duration);

		System.out.println("Duration: " + duration);

		System.out.println("Hours: " + duration.toHours());

		System.out.println("Minutes: " + duration.toMinutes());

		System.out.println("Seconds: " + duration.getSeconds());
	}
}
