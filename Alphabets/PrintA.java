package com.xworkz.Alphabets;

public class PrintA {
	public static void main(String[] args) {
		int height = 5;
		int width = (2 * height) - 1;
		int n = width / 2, i, j;

		for (i = 0; i < height; i++) {
			for (j = 0; j <= width; j++) {
				if (j == n || j == (width - n) || (i == height / 2 && j > n && j < (width - n)))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
			n--;

		}
	}
}
