package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListPractice {

	public static void main(String[] args) 
	{
		// arraylist on integer
		
		ArrayList<Integer>a=new ArrayList<>();
		
		a.add(14);
		a.add(12);
		a.add(10);
		a.add(8);
		a.add(6);
		a.add(4);
		
		System.out.println(a);
		
		System.out.println("===========");
		
		// using for each loop
		
		for(Integer p:a)
		{
			System.out.println(p);
		}
		System.out.println("===========");
		
		// arraylist on character
		
		ArrayList<Character>ca=new ArrayList<>();
		
		ca.add('A');
		ca.add('B');
		ca.add('C');
		ca.add('D');
		ca.add('E');
		ca.add('F');
		
		System.out.println(ca);
		
		System.out.println("===========");
		
		for(Character q:ca)
		{
			System.out.println(q);
		}
		System.out.println("===========");
		
		// arraylist on String
		
		ArrayList<String>sa=new ArrayList<>();
		
		sa.add("DINESH");
		sa.add("MANISH");
		sa.add("SHEKHAR");
		sa.add("ABHINAV");
		sa.add("PRASAD");
		sa.add("MOKSH");
		
		System.out.println(sa);
		System.out.println("===========");
		
		for(String r:sa)
		{
			System.out.println(r);
		}
		System.out.println("===========");
		
		//  using the linkedlist
		
		LinkedList<String>la=new LinkedList<>();
		
		la.add("DINESH");
		la.add("PRASAD");
		la.add("ABHINAV");
		la.add("PARTH");
		la.add("JIMMY");
		la.add("ROHIT");
		
		for(String s:la)
		{
			System.out.println(s);
		}
		System.out.println("==========");
		
		// using Iterator
		
		 Iterator i = a.iterator();
		
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		
	}

}
