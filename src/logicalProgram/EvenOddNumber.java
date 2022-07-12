package logicalProgram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args)
	{
       // System.out.println(10%2);
       // System.out.println(10/2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		
		int a = sc.nextInt();
		
		if(a%2==0) 
		{
			System.out.println("Given number is even ");
		}
		
		else
		{
			System.out.println("Given number is odd");
		}

	}

}
