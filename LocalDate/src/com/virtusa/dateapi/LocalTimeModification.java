package com.virtusa.dateapi;

import java.time.LocalTime;

public class LocalTimeModification {

	public static void main(String[] args) {

		LocalTime time = LocalTime.of(10, 30, 45);

		System.out.println(time);

		// add hours

		LocalTime plusHours = time.plusHours(2);

		System.out.println("plusHours : " + plusHours);

		// add min

		LocalTime plusMinutes = time.plusMinutes(12);

		System.out.println("plusMinutes : " + plusMinutes);

		// add seconds

		LocalTime plusSeconds = time.plusSeconds(11);

		System.out.println("plusSeconds : " + plusSeconds);

		// subtract min

		LocalTime minusMinutes = time.minusMinutes(22);

		System.out.println("minusMinutes : " + minusMinutes);
	}
}
