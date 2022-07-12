package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice1 {

	public static void main(String[] args)
	{
		// using integer
		
		LinkedHashSet<Integer> lhi=new LinkedHashSet<>();
		
		lhi.add(100);
		lhi.add(80);
		lhi.add(50);
		lhi.add(30);
		lhi.add(10);
		lhi.add(8);
		
		System.out.println(lhi);
		
		System.out.println("=============");
		
		// using string
		
		LinkedHashSet<String>lhs=new LinkedHashSet<>();
		
		lhs.add("london");
		lhs.add("paris");
		lhs.add("burlin");
		lhs.add("tokyo");
		lhs.add("bankok");
		lhs.add("california");
		
		System.out.println(lhs);

	}

}
