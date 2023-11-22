package com.healthservice.patient;

public class Patient {
	
	private static String name = "Muneesa";
	private static int age = 25;
	
	public static String deletePatient()
	{
		return "Patient is deleted";
	}
	
	public static void main(String[] args) {
		
		System.out.println(deletePatient());
	}
}
