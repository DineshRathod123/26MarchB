package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
	  ArrayList a=new ArrayList<>();
	  
	  a.add("Velocity");
	  a.add('B');
	  a.add(123);
	  a.add(true);
	  a.add(123.345);
	  a.add("Velocity");
	  a.add(123);
	  a.add(null);
	  a.add(true);
	  
	 System.out.println(a);
	 System.out.println(a.size());
	 System.out.println(a.isEmpty());
	 System.out.println(a.contains(123));
	 System.out.println(a.get(2));
	 System.out.println(a.indexOf(123));
	 System.out.println(a.indexOf("Velocity"));
	 System.out.println(a.lastIndexOf(null));
	 System.out.println(a.remove(5));
	 System.out.println(a.indexOf(null));
	 System.out.println(a);
	 
	 System.out.println("==========");
	 
	 for(int p=0; p<=a.size()-1; p++)
	 {
		 System.out.println(a.get(p));
	 }
	 
	 System.out.println("==========");
	 
	 for(int q=a.size()-1; q>=0; q--)
	 {
		 System.out.println(a.get(q));
	 }
	 System.out.println("==========");
	 
	 Iterator it = a.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 System.out.println("==========");
	 
	 ListIterator lit = a.listIterator();
	 
	 while(lit.hasNext())
	 {
		 System.out.println(lit.next());
	 }
	 System.out.println("==========");
	 
	 // for each loop
	 
	 for(Object v:a)
	 {
		System.out.println(v); 
	 }
	 
	
	}

}
