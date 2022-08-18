package com.codeChallenges;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int iw =in.nextInt();
		int ew = in.nextInt();
		float cost=0;
		if(iw<0 || ew<0)
			System.out.println("INVALID INPUT");
			
		else if(iw==0 && ew==0)
			System.out.println(0.0 +" INR");
		else {
			for(int i=0;i<iw;i++)
				cost+=in.nextFloat()*18;
			for(int i=0;i<ew;i++)
				cost+=in.nextFloat()*12;
			System.out.printf("%.1f INR",cost);
		}
	}

}
/*
 We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
 

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
*/