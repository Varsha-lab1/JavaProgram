package OOP;

public class Singletonpgm {
	int uploadphotos;
	static int count=0;
	static Singletonpgm s;
	
	private Singletonpgm()
	{
		System.out.println("Account created");
		count++;
	}
	void uploadphoto(int photo)
	{
		System.out.println("photo uploaded successfully");
		uploadphotos=uploadphotos+photo;
		
	}
	static Singletonpgm get()
	{
		if(count==0)
		{
			s=new Singletonpgm();
		}
		System.out.println("s="+s);
		return s;
		
	}

}
