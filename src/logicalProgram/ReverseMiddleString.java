package logicalProgram;

public class ReverseMiddleString {

	public static void main(String[] args) 
	{
		// reverse even position string
		
		String s="YE MUMBAI HAI MERI JAAN";
		String ar[]=s.split(" ");  //{"YE","MUMBAI","HAI","MERI","JAAN"}
		                           //   0     1       2     3       4
		
		for(int i=0; i<=ar.length-1; i++)
		{
			if(i%2==0)
			{
				String s1=ar[i];
				ar[i]=revStr(s1);
			}
		}
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.print(ar[i]+" ");			
		}
		
	}
	
	public static String revStr(String input)
	{
		String rev="";
		
		for(int i=input.length()-1; i>=0; i--)
		{
			rev=rev+input.charAt(i);
		}
		return rev;		
	}

}
