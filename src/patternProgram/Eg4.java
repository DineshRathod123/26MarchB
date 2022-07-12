package patternProgram;

public class Eg4 {

	public static void main(String[] args)
	{
		//*         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         *
		
		int star1=1;
		int space1=5;
		int star2=1;
		int space2=4;
		
		for(int i=1; i<=9; i++)    // outer loop for row
		{
			for(int j=1; j<=star1; j++)   // inner loop for star(left)
			{
				System.out.print("*");
			}
			for(int k=1; k<=space1; k++)   // inner loop for space(left)
			{
				System.out.print(" ");
			}
			for(int l=1; l<=space2; l++)
			{
				System.out.print(" ");
			}
			for(int m=1; m<=star2; m++)
			{
				System.out.print("*");   // inner loop for star(right)
			}
			
			if(i<5)
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;				
			}
			System.out.println();
		}
		
		

	}

}
