package com.healthservice.patient;

public class Patient {
	
	private static String name = "Behzad";
	private static int age = 25;
	
	public static String addPatient()
	{
		return "Patient is added whose name is "+ name+ " and age is "+age;
	}
	
	public static String deletePatient()
	{
		return "Patient is deleted";
	}
	
	public static void main(String[] args) {
		
		System.out.println(addPatient());
		System.out.println(deletePatient());
	}

}
