package com.smk627751.zigzagpattern;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Number of rows: ");
		int n = sc.nextInt();
		char[][] arr = new char[n][str.length()];
		int i = 0, j = 0;
		int index = 0;
		boolean down = false;
		while(index < str.length())
		{
			arr[i][j] = str.charAt(index++);
			if(i==n-1)
			{
				down = false;
			}
			else if(i == 0)
			{
				down = true;
			}
			
			if(!down)
			{
				j++;
				if(i-1 >= 0)
				{
					i--;
				}
			}
			else
			{
				i++;
			}
		}
		
		for(char[] cArr: arr)
		{
			for(char c : cArr)
			{
				if(Character.isLetterOrDigit(c))
				{
					System.out.print(c+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
