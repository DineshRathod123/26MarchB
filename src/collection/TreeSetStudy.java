package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		
		t.add(90);
		//t.add("thane");//----> class cast exception
		t.add(50);
		t.add(10);
		t.add(30);
		t.add(4);
		t.add(80);
		t.add(70);
		//t.add(null);-------> null pointer exception
		
		System.out.println(t);
		
		System.out.println("===========");
		
		// using for loop
		
		for(int a=0; a<=t.size(); a++)
		{
			System.out.println(t);
		}
		
		System.out.println("===========");
		
		// using for each 
		
		for(Object k:t)
		{
			System.out.println(k);
		}
		
		System.out.println("===========");
		
		// using Iterator
		
		Iterator it = t.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
