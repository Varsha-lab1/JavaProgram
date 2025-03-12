package day1;

import java.util.Scanner;

public class AdditionPgm {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=scan.nextInt();
		System.out.println("Enter second number");
		num2=scan.nextInt();
		System.out.println("Sum:"+(num1+num2));
		

	}

}


/*output
 Enter first number
100
Enter second number
200
Sum:300
   */
