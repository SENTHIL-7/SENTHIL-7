package com.codeChallenges;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       HashMap<String,Integer> hm = new HashMap<>();
       
       for(int i=0;i<n;i++) {
    	   String input =in.next();
    	   if(!hm.containsKey(input)) {
        	   hm.put(input,1);
           }
    	   else {
    		   hm.put(input,hm.get(input)+1);
    	   }
       }
       for(String v :hm.keySet()) {
    	   if(hm.get(v)%2!=0) {
    		   System.out.println(v);
    		   break;
    	   }
    	  
       }

	}

}
