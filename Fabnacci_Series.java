package Lecture21_Recursion;

import java.util.Scanner;

public class Fabnacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		System.out.println(Fabnacci(n));
	}

	public static int Fabnacci(int n) {
		// TODO Auto-generated method stub
		if(n==1||n==0) {
			return n;
		}
		return Fabnacci(n-1)+Fabnacci(n-2);
	}

}
