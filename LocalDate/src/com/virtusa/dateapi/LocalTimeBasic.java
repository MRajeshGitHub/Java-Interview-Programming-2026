package com.virtusa.dateapi;

import java.time.LocalTime;

public class LocalTimeBasic {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();

		System.out.println(time);// 23:40:30.557027200

		System.out.println("Current Time: " + time);

		System.out.println("Hour: " + time.getHour());

		System.out.println("Minute: " + time.getMinute());

		System.out.println("Second: " + time.getSecond());

		System.out.println("Nano: " + time.getNano());
	}

}
