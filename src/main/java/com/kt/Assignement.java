/**
 * 
 */
package com.kt;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;

/**
 * @author MD AZAR
 *
 */
public class Assignement {

	/**
	 * Below method is for printing the factorial of given number
	 * 
	 * @param number
	 */
	public void findFactorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;

		}
		System.out.println("Factorial of given number is " + factorial);
	}

	// Below method is for finding largest of two numbers
	public void largestOfTwoNumbers(int number1, int number2) {
		if (number1 > number2) {
			System.out.println("Largest number is " + number1);
		} else {
			System.out.println("Largest number is " + number2);
		}
	}

	// finding the largest of given N numbers
	public void largestNumber(int arr[]) {
		Arrays.sort(arr);
		int size = arr.length;
		System.out.println("Largest number in given integer array "
				+ arr[size - 1]);
	}

	// check the given day is week day or weekend
	public void checkForWeekEnd(String date) throws ParseException {
		Calendar cal = Calendar.getInstance();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dat = LocalDate.parse(date, formatter);
		DayOfWeek dow = dat.getDayOfWeek();
		String day = dow.toString();
		if (day.equals("SUNDAY") || day.equals("SATURDAY")) {
			System.out.println("Its weekend " + day);
		} else {
			System.out.println("its weekday " + day);
		}

	}

	// print the all even numbers between 10 to 40

	public void printEvenNumbers() {
		System.out.println("Even numbers are");
		for (int i = 10; i <= 40; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) throws ParseException {
		Assignement assignement = new Assignement();

		// calling the method to find factorial of a number
		assignement.findFactorial(5);

		// Calling the method to find largest of two numbers
		assignement.largestOfTwoNumbers(5, 2);

		// calling the method to find largest of N numbers
		int numbers[] = { 4, 10, 6, 1 };
		assignement.largestNumber(numbers);

		// calling the method to find given date is week day or week end
		assignement.checkForWeekEnd("20/07/2017");
	}

}
