/**
 * File Name: errors.java
 * Author: Mansoor Muhammad
 * Date Created: March 29, 2026
 * Date Last Edited: March 29, 20126
 */

import java.util.Scanner;

class PracticeProblem {

	
  	public static void main(String[] args) {
		
		q1();
		q2();
		q3();
		q4();
  	}
  	public static void q1() {
		static Scanner a = new Scanner(System.in);
		// From input, recieve two integers from the user and add them together.  Output the result.
		int num1;
		System.out.print("Input a number: ");
		num1 = a.nextInt();
		
		int num2;
		System.out.print("Input a number: ");
		num2 = a.nextInt();

		System.out.println(num1 + num2);
  	}

	public static void q2() {
		static Scanner a = new Scanner(System.in);
		// From input recieve two integers.  Output the quotient rounded down.
		int num1;
		System.out.print("Input a number: ");
		num1 = a.nextInt();
	
		int num2;
		System.out.print("Input a number: ");
		num2 = a.nextInt();
		
		System.out.println(num1 / num2);
	}

	public static void q3() {
		static Scanner a = new Scanner(System.in);
		// Output the phrase "hello "Mr. Kalisz" have you seen my work yet?"
		
		System.out.println("hello \"Mr. Kalisz\" have you seen my work yet?");
	}

	public static void q4() {
		static Scanner a = new Scanner(System.in);
		// From input recieve two numbers (can be decimal fractions).  
		// Output the first number plus two, then multiplied by the second number.
		Double num1;
		System.out.print("Input a number: ");
		num1 = a.nextDouble();
		Double num2;
		System.out.print("Input a number: ");
		num2 = a.nextDouble();
		
		System.out.println((num1 + 2) * num2);
	}
}
