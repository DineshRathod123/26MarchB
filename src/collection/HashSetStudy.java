package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		
		hs.add("mumbai");
		hs.add(null);
		hs.add(123);
		hs.add(346.345);
		hs.add(true);
		hs.add("mumbai");
		hs.add(null);
		hs.add('A');
		
		System.out.println(hs);
		
		System.out.println(hs.clone());
		System.out.println(hs.contains(123));
		System.out.println(hs.equals(null));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		System.out.println("============");
		
		//  using for loop
		
		for(int a=0; a<=hs.size()-1; a++)
		{
			System.out.println(hs);
		}
		System.out.println("============");
		
		// for each loop
		
		for(Object x:hs)
		{
			System.out.println(x);
		}
		System.out.println("============");
		
		// using Iterator
		
		Iterator i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
