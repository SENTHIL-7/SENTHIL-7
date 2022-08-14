package com.javacode;

import java.util.Scanner;

public class PrintYearMonth {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int yy = sc.nextInt();
        System.out.print("Enter month : ");
        int mm = sc.nextInt();
  
        int d = 1;
        int m = 1;
        int y = 1;
        int week = 1;
        String day[] = { "SUN", "MON", "TUE", "WED",
                         "THU", "FRI", "SAT" };

        int ar[] = { 31, 29, 31, 30, 31, 30,
                     31, 31, 30, 31, 30, 31 };
        while (true) {
  
            if (d == 1 && m == mm && y == yy) {
                break;
            }
  
            if (y % 4 == 0 && y % 100 != 0
                || y % 400 == 0) {
                ar[1] = 29;
            }
  
            else {
                ar[1] = 28;
            }
            week++;
            d++;
  
            if (d > ar[m - 1]) {
                m++;
                d = 1;
            }
  
            if (m > 12) {
                m = 1;
                y++;
            }
  
            if (week == 7) {
                week = 0;
            }
        }
  
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            ar[1] = 29;
        }
        else {
            ar[1] = 28;
        }
  
        for (int k = 0; k < 7; k++) {
            System.out.print("  " + day[k]);
        }
  
        System.out.println();
        System.out.printf(" ");
       for(int i=0;i<week;i++) {
    	   System.out.printf("     ");
       }
       for(int i=1;i<ar[mm-1];i++) {
    	   System.out.printf("%4d ",i);
    	   if((week+i)%7==0) {
    		   System.out.println();
    		   System.out.printf("  ");
    	   }
       }

	}

}
