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

/*
 *here is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR is never remain empty as when last k candies are left. JAR if refilled with new candies in such a way that JAR get full.
Write a code to implement above scenario. Display JAR at counter with available number of candies. Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and display JAR at Counter.

Output should give number of Candies sold and updated number of Candies in JAR.

If Input is more than candies in JAR, return: “INVALID INPUT”
Given,
N=10, where N is NUMBER OF CANDIES AVAILABLE
K =< 5, where k is number of minimum candies that must be inside JAR ever.
Example 1:(N = 10, k =< 5)

Input Value
3
Output Value
NUMBER OF CANDIES SOLD : 3
NUMBER OF CANDIES AVAILABLE : 7
*/
