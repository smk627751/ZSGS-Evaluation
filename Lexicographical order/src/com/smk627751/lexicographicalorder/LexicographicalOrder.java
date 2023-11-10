package com.smk627751.lexicographicalorder;

import java.util.Scanner;

public class LexicographicalOrder {
	public static String sort(String str)
	{
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++)
		{
			char max = arr[i];
			int maxIndex = i;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] > max)
				{
					max = arr[j];
					maxIndex = j;
				}
				
			}
			char temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		
		return new String(arr);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings to be entered=");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter String"+(i+1)+":");
			String str = sc.next();
			System.out.println(sort(str));
		}
	}
}
