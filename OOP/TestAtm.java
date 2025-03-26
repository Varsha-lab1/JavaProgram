package OOP;

public class TestAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a=new Atm();
		System.out.println(a.getPin());
		a.setPin(4567);
		System.out.println(a.getPin());

	}
}
/*output
123
4567
*/
