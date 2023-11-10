package com.smk627751.spiraltriangle;

public class SpiralTriangle {

	public static void main(String[] args) {
		int n = 3;
		int val = 1;
		int dir = 0;
		int[][] arr = new int[n][n];
		int up = 0, down = arr.length-1, left = 0, right = arr.length - 1;
		for(int i = 0; i < n; i++)
		{
			if(dir == 0)
			{
				int j = left;
				for(; up < arr.length && left < arr.length; up++)
				{
					arr[up][j] = val++;
					j++;
				}
				down--;
				left++;
			}
			
			if(dir == 1)
			{
				for(;down >= 0; down--)
				{
					arr[down][right] = val++;
				}
				right--;
				down++;
			}

			if(dir == 2)
			{
				int j = right;
				for(;j> 0; j --)
				{
					arr[down][j] = val++;
				}
				right--;
			}
			
			dir = (dir+1)%3;
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
