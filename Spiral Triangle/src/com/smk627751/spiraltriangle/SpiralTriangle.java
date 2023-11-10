package com.smk627751.spiraltriangle;

public class SpiralTriangle {

	public static void main(String[] args) {
		int n = 5;
		int val = 1;
		int[][] arr = new int[n][n];
		int up = 0, down = arr.length-1, left = 0, right = arr.length - 1;
		while(up < down||left<right) {
			for(int i = up; i <= down; i++) {
				arr[i][left+i] = val++;
			}
			left++;
			down--;
			for(int i = down; i >= up; i--) {
				arr[i][right] = val++;
			}
			right--;
			for(int i = right; i >= left; i--) {
				if(i == left && up != 0)
					break;
				arr[up][i] = val++;
			}
			up++;
			down--;
		}
		
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
