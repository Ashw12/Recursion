package Lecture20_Recursion;

import java.util.Scanner;

public class Print_Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		IncDec(n);
	}

	private static void IncDec(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		IncDec(n-1);
		System.out.print(""+ " "+n+" ");
		
	    }

	}


