package com.smk627751.jumblednumber;

import java.util.Scanner;

public class JumbledNumber {
	public static boolean isJumbled(int num)
	{
		if(num < 10) return false;
		
		int prev = 0;

		while(num != 0)
		{
			int digit = num % 10;
			if(digit == prev - 1 || digit == prev + 1)
			{
				return true;
			}
			num = num / 10;
			prev = digit;
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(isJumbled(num))
		{
			System.out.print( num + " is a jumbled number");
		}
		else System.out.print( num + " is a not jumbled number");
	}
}
