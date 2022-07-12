package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList li=new LinkedList<>();
		
		li.add("mumbai");
		li.add(456);
		li.add('B');
		li.add("nagpur");
		li.add(null);
		li.add("mumbai");
		li.add(null);
		li.add(false);
		
		System.out.println(li);
		
		System.out.println("===========");
		
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		System.out.println(li.clone());
		System.out.println(li.contains('B'));
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.peek());
		System.out.println(li);
		System.out.println(li.poll());
		System.out.println(li);
		System.out.println(li.pop());
		System.out.println(li);
		
		System.out.println("===========");
		
		// using for loop
		
		for(int p=0; p<=li.size()-1; p++)
		{
			System.out.println(li.get(p));
		}
		System.out.println("===========");
		
		// using for each loop
		
		for(Object v:li)
		{
			System.out.println(v);
		}
		System.out.println("===========");
		
		// using list Iterator
		
		ListIterator list = li.listIterator();
		
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("===========");
		
		// using Iterator
		
		Iterator it = li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
