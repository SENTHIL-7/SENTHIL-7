package com.algorithm;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {3,2,1,5,9,3,2};
		int sortarr[]=mergeSort(arr,0,arr.length-1);
		for(int n:sortarr) {
			System.out.print(n +" ");
		}
	}
	static int[] mergeSort(int arr[],int low,int high) {
		
		if(low==high) {
			int[] br = new int[1];
			br[0]=arr[low];
			return br;
		}
		int mid = (low+high)/2;
		int[] fh =mergeSort(arr,low,mid);
		int[] sh =mergeSort(arr,mid+1,high);
		
		int[] merge =mergeTwoArr(fh,sh);
		return merge;
	}
	static int[] mergeTwoArr(int one[],int[] two) {
		int i=0;
		int j=0;
		int k=0;
		int[] sorted =new int[one.length+two.length];
		while(i<one.length && j< two.length) {
			if(one[i]<two[j]) {
				sorted[k]=one[i];
				k++;
				i++;
			}
			else {
				sorted[k]=two[j];
				k++;
				j++;
			}
		}
		if(i==one.length) {
			while(j<two.length) {
				sorted[k]=two[j];
				k++;
				j++;
				
			}
		}
		if(j==two.length) {
			while(i<one.length) {
				sorted[k]=one[i];
				k++;
				i++;
				
			}
		}
		return sorted;
	}

}
