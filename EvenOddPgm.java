package day1;

import java.util.Scanner;

public class EvenOddPgm {

	public static void main(String[] args) {
		int num1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num1=scan.nextInt();
		if(num1%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}

	}

}
/*output
 Enter a number
2000
Number is even
 
 */
  
 
