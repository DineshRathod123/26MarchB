package logicalProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of string:");
		String x = sc.next();
		String y="";
		
		for(int j=x.length()-1; j>=0; j--)
		{
			y=y+x.charAt(j);
		}
		
		System.out.println("Original string is "+x);
		System.out.println("Reverse string is "+y);
		
		if(x.equals(y))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not in  palindrome");
		}

	}

}
