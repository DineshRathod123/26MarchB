package logicalProgram;

public class NoOfWhiteSpaceInString {

	public static void main(String[] args)
	{
		String s=" MU M B A  I ";
		int count=0;
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char myChar = s.charAt(i);
			
			if(myChar==' ')
			{
				count++;
			}
		}
		
		System.out.println("Number of white space in "+s+" is "+count);

	}

}
 