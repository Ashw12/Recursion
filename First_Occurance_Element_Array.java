package Lecture21_Recursion;

import java.util.Scanner;

public class First_Occurance_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		System.out.println(Occurance(arr,item,0));
		

	}

	public static int Occurance(int[] arr, int item,int i ) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return 1;
		}
		return Occurance(arr,item,i+1);
		
	}

}
