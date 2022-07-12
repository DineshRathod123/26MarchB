package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args)
	{
		HashSet<Integer>hsi =new HashSet<>();
		
		hsi.add(20);
		hsi.add(16);
		hsi.add(14);
		hsi.add(12);
		hsi.add(10);
		hsi.add(6);
		
		System.out.println(hsi);
		System.out.println("=========");
		
		// using for loop
		
		for(int b=0; b<=hsi.size()-1; b++)
		{
			System.out.println(hsi);
		}
		
		System.out.println("=========");
		
		// using for each loop
		
		for(Integer z:hsi)
		{
			System.out.println(z);
		}
		System.out.println("=========");
		
		// HashSet by String
		
		HashSet<String>hss=new HashSet<>();
		
		hss.add("MUMBAI");
		hss.add("DELHI");
		hss.add("AGRA");
		hss.add("KANPUR");
		hss.add("JHANSI");
		hss.add("HYDRABAD");
		
		System.out.println(hss);
		
		System.out.println("=========");
		
		// using for each loop
		
		for(String y:hss)
		{
			System.out.println(y);
		}
		
		System.out.println("=========");
		
		// using Iterator
		
		Iterator<String> si = hss.iterator();
		
		while(si.hasNext())
		{
			System.out.println(si.next());
		}
	}

}
