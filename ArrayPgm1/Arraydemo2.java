package Arrays;
//using Scanner
import java.util.Scanner;

public class Arraydemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter index size");
		int size=scan.nextInt();
		int []arr1=new int[size];
		System.out.println("enter"+size+"elements");
		for(int i=0;i<size;i++)
		{
			int a=scan.nextInt();
			arr1[i]=a;
				}
System.out.println("__________________");
System.out.println("array elements are:");
for(int i=0;i<arr1.length;i++)
{
System.out.println(arr1[i]);	
}
	}
}
/*output
enter index size
5
enter5elements
2
3
6
5
4
__________________
array elements are:
2
3
6
5
4
*/
