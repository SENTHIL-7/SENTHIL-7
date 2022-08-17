package com.codeChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[][] Trainees = new int[3][3];
		int[] avg = new int[3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				Trainees[i][j]=in.nextInt();
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				avg[i]=avg[i]+Trainees[i][j];
		int max=0;
		for(int i=0;i<3;i++)
			if(max<avg[i])
				max=avg[i];
		
		for(int i=0;i<3;i++)
			if(max==avg[i])
				System.out.println("Trainee Number :"+ (i+1));
		
	}

}

/*
 Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.

Display the most fit trainee (or trainees) and the highest average oxygen level.

Note:

The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.
Average Oxygen Values should be rounded.
Example 1:
INPUT VALUES
95
92
95
92
90
92
90
92
90

OUTPUT VALUES
Trainee Number : 1
Trainee Number : 3
*/
