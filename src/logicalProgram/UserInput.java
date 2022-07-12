package logicalProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter value of b:");
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("Sum is "+sum);

	}

}
