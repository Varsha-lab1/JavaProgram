package day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,a=0,b=0,c=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		num=scan.nextInt();
		for(int i=0;i<=num;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}

	}

}

/*output
 * enter a number
10
0
1
1
2
3
5
8
13
21
34
55
*/
