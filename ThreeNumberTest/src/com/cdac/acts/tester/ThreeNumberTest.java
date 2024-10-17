package com.cdac.acts.tester;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumberTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter Three Number : ");
		int num3 = sc.nextInt();
		
		int [] number = new int[] {num1, num2, num3};
		
		Arrays.sort(number);
		
		System.out.println("Sum of Greatest numbers are = " + (number[1] + number[2]));
		System.out.println("Sum of Smallest numbers are = " + (number[0] + number[1]));
		
		sc.close();
		
	}
}
