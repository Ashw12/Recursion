package Lecture20_Recursion;

import java.util.Scanner;

public class Print_Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Decreasing(n);
	}

	private static void Decreasing(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		Decreasing(n-1);

	    }
	}


