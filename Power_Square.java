package Lecture20_Recursion;

import java.util.Scanner;

public class Power_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	   power(a,b);
           System.out.println(power(a,b));
	}

	public static int power(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return 1;
		}
	  int ans=power(a,b-1);//Recursive call.ye hame recursion lake dega.
	  return a*ans;
	}

}
