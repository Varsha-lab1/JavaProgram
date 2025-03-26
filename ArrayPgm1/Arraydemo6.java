package Arrays;

public class Arraydemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraydemo5 arr[]=new Arraydemo5[5];
		arr[0]=new Arraydemo5("city", 7858);
		arr[1]=new Arraydemo5("B", 47858);
		arr[2]=new Arraydemo5("c", 785858);
		arr[3]=new Arraydemo5("d", 57858);
		arr[4]=new Arraydemo5("e", 787858);
		System.out.println("car elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
/*output
car elements are:
city 7858.0
B 47858.0
c 785858.0
d 57858.0
e 787858.0
*/
