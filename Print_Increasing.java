package Lecture20_Recursion;

import java.util.Scanner;

public class Print_Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Increasing(n);
	}

	private static void Increasing(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		Increasing(n-1);
		System.out.print(n+" ");

	}

}


