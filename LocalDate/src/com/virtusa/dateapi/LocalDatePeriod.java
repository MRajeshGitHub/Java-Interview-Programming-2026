package com.virtusa.dateapi;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriod {

	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(2005, 5, 18);

		LocalDate endDate = LocalDate.of(2020, 3, 22);

		Period period = Period.between(startDate, endDate);
		System.out.println(period);

		System.out.println("End Date: " + endDate);

		System.out.println("Years: " + period.getYears());
		System.out.println("Months: " + period.getMonths());
		System.out.println("Days: " + period.getDays());

		System.out.println("Complete Period: " + period);
	}
}
