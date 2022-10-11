package Lecture20_Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}

	public static int fact(int n) {
		// TODO Auto-generated method stub
		if( n==1||n==0) {
			return 1;
		}
		return n*fact(n-1);
	}

}
