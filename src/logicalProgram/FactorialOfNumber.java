package logicalProgram;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		int num=6;
		int dum=1;
		
		for(int i=num; i>=1; i--)
		{
			dum=dum*i;
		}
		
		System.out.println("Factorial of number is "+dum);

	}

}
