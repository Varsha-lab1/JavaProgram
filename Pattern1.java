package PatternPgm;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.print("\n");
		}
	}
}

/*output
 enter number
5
1
12
123
1234
12345
*/
