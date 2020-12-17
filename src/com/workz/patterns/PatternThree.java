package com.workz.patterns;

public class PatternThree {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i1 = 1; i1 <= 4; i1++) {
			for (int j = 4; j >= i1; j--) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
	}
}
