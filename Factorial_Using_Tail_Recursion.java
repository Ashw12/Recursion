package Lecture21_Recursion;

import java.util.Scanner;

public class Factorial_Using_Tail_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n,1));
	}

	public static int fact(int n,int ans) {
		// TODO Auto-generated method stub
		if( n==1||n==0) {
			return ans;
		}
		return fact((n-1),ans*n);
	}

	}