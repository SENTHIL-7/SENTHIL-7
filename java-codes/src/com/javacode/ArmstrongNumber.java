package com.javacode;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int num =in.nextInt();
		 int temp=num;
		 int len = String.valueOf(num).length();

		 int sum=0;
		 
		 while(num!=0) {
			 int res = num%10;
			 sum =sum +(int)Math.pow(res,len);
			 num=num/10;
		 }
		 if(sum==temp)
			 System.out.println("it is  Armstrong number.");
		 else
			 System.out.println("it is not Armstrong number.");

	}

}
