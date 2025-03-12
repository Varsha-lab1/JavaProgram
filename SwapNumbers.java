package day1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int x,y,z;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		x=scan.nextInt();
		y=scan.nextInt();
		System.out.println("Before swap"+"x="+x +","+"y="+y);
		z=x;
		x=y;
		y=z;
		System.out.println("After swap"+"x="+x +","+"y="+y);

	}

}
