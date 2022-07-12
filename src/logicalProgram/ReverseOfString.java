package logicalProgram;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String p = sc.next();   // original string
		String q="";
		
		for(int i=p.length()-1; i>=0; i--)
		{
		    q=q+p.charAt(i);
		}
		System.out.println("Original String is "+p);
		System.out.println("Reverse String is "+q);

	}

}
