package day1;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		char[] str=scan.next().toCharArray();
		for(int i=0;i<=str.length-1;i++)
		{
			count++;
			
		}
		System.out.println(count);

	}

	
	/*output
	 * Enter a string
test
4
*/
	 */
}
