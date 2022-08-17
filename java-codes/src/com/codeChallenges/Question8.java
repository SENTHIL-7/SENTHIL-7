package com.codeChallenges;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int iw =in.nextInt();
		int ew = in.nextInt();
		float[] iarr= new float[iw];
		float[] earr= new float[ew];
		float isum =0;
		float esum =0;
		for(int i=0;i<iw;i++)
		{
			iarr[i]+=in.nextFloat()*18;
			 isum+=iarr[i];
		}
		for(int i=0;i<ew;i++)
		{
			earr[i]+=in.nextFloat()*12;
			esum+=earr[i];
		}
		
		System.out.println(isum+esum +" INR");
	}

}
