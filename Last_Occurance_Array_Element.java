package Lecture21_Recursion;

import java.util.Scanner;

public class Last_Occurance_Array_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		System.out.println(LastOccurance(arr,item,arr.length-1));
		

	}

	public static int LastOccurance(int[] arr, int item,int i ) {
		// TODO Auto-generated method stub
		if(i<0) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		return LastOccurance(arr,item,i-1);
		
	}

	}


