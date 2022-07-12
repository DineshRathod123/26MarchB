package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args)
	{
		LinkedHashSet ihs=new LinkedHashSet();
		
		ihs.add("delhi");
		ihs.add("delhi");
		ihs.add(1234);
		ihs.add(127.987);
		ihs.add("A");
		ihs.add(true);
		ihs.add(null);
		ihs.add(true);
		
		System.out.println(ihs);
		
		System.out.println(ihs.clone());
		System.out.println(ihs.size());
		System.out.println(ihs.contains(true));
		System.out.println(ihs.isEmpty());
		System.out.println(ihs.remove(1234));
		System.out.println(ihs);

		System.out.println("=========");
		
		// using for loop
		
		for(int a=0; a<=ihs.size()-1; a++)
		{
			System.out.println(ihs);
		}
		
		System.out.println("=========");
		
		// using for each loop
		
		for(Object p:ihs)
		{
			System.out.println(p);
		}
		
		System.out.println("=========");
		
		// using Iterator
		
		Iterator is = ihs.iterator();
		
		while(is.hasNext())
		{
			System.out.println(is.next());
		}
	}

}
