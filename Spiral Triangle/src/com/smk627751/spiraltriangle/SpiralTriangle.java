package com.smk627751.spiraltriangle;

import java.util.Scanner;

public class SpiralTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = 1;
		int[][] arr = new int[n][n];
		int up = 0, down = arr.length-1, left = 0, right = arr.length - 1;
		while(up <= down && left <= right) {
			for(int i = up; i <= down; i++) {
				arr[i][up+i] = val++;
			}
			left++;
			down--;
			for(int i = down; i >= up; i--) {
				arr[i][right] = val++;
			}
			right--;
			down--;
			for(int i = right; i >= left; i--) {
				arr[up][i] = val++;
			}
			up++;
			left++;
		}
		
//		while(up <= down && left <= right) {
//			for(int i = up; i <= down; i++) {
//				arr[i][i-left] = val++;
//			}
//			up++;
//			right--;
//
//			for(int i = right; i >= left; i--) {
//				arr[down][i] = val++;
//			}
//
//			down--;
//			right--;
//			for(int i = down; i >= up; i--) {
//				arr[i][left] = val++;
//			}
//			left++;
//			up++;
//		}
//		int diagonal = arr.length - 1;
//		while(up <= down && left <= right)
//		{
//			for(int i = up; i <= down; i++)
//			{
//				arr[i][diagonal - i] = val++;
//			}
//			diagonal--;
//			right--;
//			down--;
//			for(int i = down; i >= up; i--)
//			{
//				arr[i][left] = val++;
//			}
//			left++;
//			down--;
//			for(int i = left; i <= right; i++)
//			{
//				arr[up][i] = val++;
//			}
//			up++;
//			right--;
//		}
		
		for(int[] ar : arr)
		{
			for(int a: ar)
			{
				if(a != 0)
				{
					System.out.printf("%2d ",a);
				}
				else
				{
					System.out.printf("%3s"," ");
				}
			}
			System.out.println();
		}
	}

}
