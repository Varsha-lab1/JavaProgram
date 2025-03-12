package day1;

import java.util.Scanner;

public class Swap3Numbers {

	public static void main(String[] args) {
		int x,y,temp;
		//Swap two numbers without using third var
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		x=scan.nextInt();
		y=scan.nextInt();
		System.out.println("Before Swapping"+x+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping"+x+y);
		
		

	}

}

/*output
Enter 2 numbers
10
14
Before Swapping1014
After swapping1410
*/