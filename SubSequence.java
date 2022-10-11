package Lecture21_Recursion;

import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sub-Sequence:-It is define as forward moving but not mandatory contiguous Character.
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans="";
		Subsequence(str,ans);

	}

	public static void Subsequence(String str, String ans ) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=str.charAt(0);
		Subsequence(str.substring(1),ans);
		Subsequence(str.substring(1),ans+ch);
	}

}
