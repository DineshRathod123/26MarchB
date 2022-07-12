package logicalProgram;

public class ReverseTheNumberByConvert {

	public static void main(String[] args)
	{
		int orgNum=456;
		String orgString = Integer.toString(orgNum);
		String revString = "";
		
		for(int i=orgString.length()-1; i>=0; i--)
		{
			revString=revString+orgString.charAt(i);
		}
		
		int revNum = Integer.parseInt(revString);
		System.out.println("Original number is "+orgNum);
		System.out.println("Reverse number is "+revNum);

	}

}
