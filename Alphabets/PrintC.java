package com.xworkz.Alphabets;

public class PrintC {

	public static void main(String[] args) {

		int i, j;
		int height = 5;
		for (i = 0; i < height; i++) {
			System.out.printf("* ");
			for (j = 0; j < (height - 1); j++) {
				if (i == 0 || i == height - 1)
					System.out.printf("* ");
				else
					continue;
			}
			System.out.printf("\n");
		}
	}

}
