package day1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a string");
	char[] str=scan.next().toCharArray();
	for(int i=str.length-1;i>=0;i--)
	{
		System.out.print(str[i]);
	}
	System.out.print("\n");

	}

}

/*output
 * Enter a string
Yash
hsaY
*/
