package OOP;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletonpgm s1=Singletonpgm.get();
		System.out.println("s1="+s1);
		s1.uploadphoto(2);
		System.out.println("________________________");
		Singletonpgm s2=Singletonpgm.get();
		System.out.println("s2="+s2);
		s1.uploadphoto(4);

	}

}
/*output
Account created
s=OOP.Singletonpgm@49097b5d
s1=OOP.Singletonpgm@49097b5d
photo uploaded successfully
________________________
s=OOP.Singletonpgm@49097b5d
s2=OOP.Singletonpgm@49097b5d
photo uploaded successfully
*/
