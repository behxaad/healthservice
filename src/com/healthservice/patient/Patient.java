package com.healthservice.patient;

public class Patient {
	
	private static String name = "Muneesa Majid";
	private static int age = 25;
	
	public static String deletePatient()
	{
		return "Patient is deleted";
	}
	
	public static String noWork()
	{
		return "Dummy Feature made by Muneesa";
	}
	
	public static void main(String[] args) {
		
		System.out.println(deletePatient());
	}
}
