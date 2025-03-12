package day1;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		int n1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		n1=scan.nextInt();
		System.out.println("Sum of the digit is"+ sumDigits(n1));
	}
		public static int sumDigits(int n1)
		{
			int sum=0;
			while(n1!=0)
			{
				sum += n1 % 10;
				n1 /=10;
			}
			return sum;
		}
		
	}

/*output
 * Enter a number
15
Sum of the digit is6
*/
 */

