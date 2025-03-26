package Arrays;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {15,5,40,89,7};
		System.out.println("without sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("_____________");
		Arrays.sort(arr);
		System.out.println("after sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("_____________");
		System.out.println("reverse order:");
		for(int i=4;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}
}
/*output
without sorting:
15
5
40
89
7
_____________
after sorting:
5
7
15
40
89
_____________
reverse order:
89
40
15
7
5
*/
