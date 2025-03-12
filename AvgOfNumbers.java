package day1;

import java.util.Scanner;

public class AvgOfNumbers {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		n1=scan.nextInt();
		n2=scan.nextInt();
		n3=scan.nextInt();

		//int avg=n1+n2+n3/3;
		System.out.println("Average of three numbers="+(n1+n2+n3)/3);

	}

}
