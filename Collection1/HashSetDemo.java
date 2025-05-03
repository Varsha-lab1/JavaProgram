package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set myset=new HashSet();
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(100);
		myset.add(null);
		myset.add(null);
		System.out.println(myset);
		myset.remove(10.5);
		System.out.println(myset);
		ArrayList al =new ArrayList(myset);
		System.out.println(al);
		for (Object x: myset)
		{
			System.out.println(x);
		}
		myset.clear();
		System.out.println(myset.isEmpty());
		
	}

}
