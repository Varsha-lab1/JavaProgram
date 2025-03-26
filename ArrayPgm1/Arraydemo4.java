package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Multidimensional array using scanner
public class Arraydemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int size=scan.nextInt();
		int []arr1=new int[size];
		/*System.out.println("enter array elements");
		for(int i=0;i<arr1.length;i++)
		{
			int a=scan.nextInt();
			arr1[i]=a;
		}*/
		System.out.println("enter nno.of rows and column");
		int rows=scan.nextInt();
		int column=scan.nextInt();
		int [][]data=new int[rows][column];
		System.out.println("enter the elements row by row");
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data.length;j++)
			{
				int value=scan.nextInt();
				data[i][j]=value;
			}
		}
			System.out.println(Arrays.deepToString(data));
			scan.close();
		

	}

}
