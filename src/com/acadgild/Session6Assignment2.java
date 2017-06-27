package com.acadgild;

import java.util.Scanner;

/**
 * 
 * Main class to invoke exception NegativeAgeException. Here main method throws
 * NegativeAgeException if the entered age is less than 0
 *
 */
public class Session6Assignment2 {

	public static void main(String[] args) throws NegativeAgeException {
		Scanner s = new Scanner(System.in);

		// Accept Age
		System.out.print("Enter Age: ");
		int age = s.nextInt();
		s.close();

		// Check if age is negative. If negative then throw NegativeAgeException
		if (age < 0) {
			throw new NegativeAgeException("Invalid Age " + age + ". Age cannot be negative");
		}

		// If no exception then display the age.
		System.out.println("Age entered is " + age);

	}
}
