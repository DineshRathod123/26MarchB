package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		v.add("mumbai");
		v.add("pune");
		v.add(456);
		v.add('A');
		v.add(null);
		v.add(5.6);
		
		System.out.println(v.elementAt(2)); // elementAt use in vector only
		System.out.println(v.get(2));
		System.out.println(v);
		System.out.println(v.remove(null));
		System.out.println(v);
		
		System.out.println("===========");
		
		// using listIteractor
		
		ListIterator lt=v.listIterator();
		
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("===========");
		
		// using Iterator
		
		Iterator i=v.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		System.out.println("===========");
		
		// using for each loop
		
		for(Object x:v)
		{
			System.out.println(x);
		}
		System.out.println("===========");
		
		// using Enumeration
		
		Enumeration ev=v.elements();
		
		while(ev.hasMoreElements()) 
		{
			System.out.println(ev.nextElement());
		}
		System.out.println("===========");
		
		
	}

}
