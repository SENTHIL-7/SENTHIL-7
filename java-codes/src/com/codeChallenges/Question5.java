package com.codeChallenges;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 int n = in.nextInt();
	 int available =10;
	 int k=5;
	 if(n>0&&n<=k) {
		 System.out.println("NUMBER OF CANDIES SOLD : "+n);
		 System.out.println("NUMBER OF CANDIES AVAILABLE : " +(available-n));
	 }
	 else {
		 System.out.println("INVALID INPUT");
		 System.out.println("NUMBER OF CANDIES AVAILABLE : "+available);
	 }
	}

}
