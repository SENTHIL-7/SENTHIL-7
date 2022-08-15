package com.codeChallenges;

import java.util.Scanner;

public class Question3 {
 public static void main(String[] args) {
	 
	 Scanner in = new Scanner(System.in);
	 int T = in.nextInt();
	 int[] E= new int[T];
	 int[] L = new int[T];
	 for(int i=0;i<T;i++) {
		 E[i]=in.nextInt();
	 }
	 for(int i=0;i<T;i++) {
		 L[i]=in.nextInt();
	 }
	 int max=0;
	 int present =0;
	 for(int i=0;i<T;i++) {
		 present =present +E[i] -L[i];
		 if(max<present) {
			 max=present;
		 }
	 }
	 System.out.println(max);
 }
}
