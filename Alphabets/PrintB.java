package com.xworkz.Alphabets;

public class PrintB {

	public static void main(String[] args) {

		int height = 5;

		int i, j, half = (height / 2);
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			int width = 4;
			for (j = 0; j < width; j++) {
				if ((i == 0 || i == height - 1 || i == half) && j < (width - 2))
					System.out.printf("*");
				else if (j == (width - 2) && !(i == 0 || i == height - 1 || i == half))
					System.out.printf("* ");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}

	}

}
