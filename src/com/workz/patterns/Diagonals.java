package com.workz.patterns;

public class Diagonals {

	public static void main(String[] args) {
			System.out.println("daigonal");
			
			int num=5;
			for(int i=0;i<num;i++)
			{
				for(int j=0;j<num;j++)
				{
					if(i==j)
					{
						System.out.println("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
				System.out.println();
			}

		}
}