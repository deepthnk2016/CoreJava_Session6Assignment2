package com.acadgild;

/**
 * 
 * Custom Exception class
 *
 */
@SuppressWarnings("serial")
public class NegativeAgeException extends Exception {
	public NegativeAgeException(String s) {
		super(s);
	}
}
