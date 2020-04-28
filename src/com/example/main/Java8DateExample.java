package com.example.main;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Java8DateExample {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String strDate = date.format(formatter);
		System.out.println(strDate);
		System.out.println(LocalDate.parse(strDate,formatter));
		
		LocalDate date2 = LocalDate.of(1990, 02, 05);
		System.out.println(date2);
		
		System.out.println(ZoneId.getAvailableZoneIds());
	}

}
