package day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String reverse="";
		Scanner scan=new Scanner(System.in);
		int length;
		System.out.println("Enter a string");
		
		 str=scan.nextLine();
		 length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			 reverse=reverse+str.charAt(i);
		
		}
		System.out.println("Reverse is:"+ reverse);
		if(str.equals(reverse))
			System.out.println("the string is palindrome");
		else
			System.out.println("the string is not a palindrome");
			

	}

}
/*output
Enter a string
Test
Reverse is:tseT
the string is not a palindrome
*/