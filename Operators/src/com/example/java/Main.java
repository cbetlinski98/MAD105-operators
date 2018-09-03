package com.example.java;

public class Main {

    public static void main(String[] args) {
	int intValue1 = 37;
	int intValue2 = 24;

	int result1 = intValue1 + intValue2;
	System.out.println("24 + 37 = " + result1);

	int result2 = intValue1 - intValue2;
	System.out.println("24 - 37 = " + result2);

	int result3 = intValue1 * intValue2;
	System.out.println("24 * 37 = " + result3);

	double result4 = (double) intValue1 / intValue2;
	System.out.println("24 / 37 = " + result4);

	double result5 = (double) intValue1 % intValue2;
	System.out.println("24 % 37 = " + result5);
    }
}
