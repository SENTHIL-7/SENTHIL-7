package com.codeChallenges;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		int arr[][] = new int[row][col];
		
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				arr[i][j]=in.nextInt();
		
		int max=0;
		int resultRow=0;
		for(int i=0;i<row;i++) {
			int count=0;
			for(int j=0;j<col;j++) {
				if(arr[i][j]==1) {
					count+=1;
				}
			}
			if(max<count) {
				max=count;
				resultRow=i+1;
			}
		}
		System.out.println(resultRow);
	}

}
