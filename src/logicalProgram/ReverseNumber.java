package logicalProgram;

public class ReverseNumber {

	public static void main(String[] args)
	{
		int orgNum=123;
		int revNum=0;
		
		for(int i=orgNum; i>0; i=i/10)
		{
			int rem=i%10;
			
			revNum=revNum*10+rem;
		}
		System.out.println("Original number is "+orgNum);
		System.out.println("Reverse number is "+revNum);

	}

}
