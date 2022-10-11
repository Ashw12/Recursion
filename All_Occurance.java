package Lecture21_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class All_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		AllOccurance(arr,item,0);
		

	}

	public static void AllOccurance(int[] arr, int item,int i ) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return;
		}
		if(arr[i]==item) {
			System.out.print(i+" ");
		}
		AllOccurance(arr,item,i+1);
		
	}

	}


