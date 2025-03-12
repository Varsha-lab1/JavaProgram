package day1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num1,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num1=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			n=num1*i;
		System.out.println(num1+"*"+i+"="+n);
		//System.out.println(n);
		}
	}

}

/*output
 Enter a number
2
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
2*10=20
. 
 
 */

