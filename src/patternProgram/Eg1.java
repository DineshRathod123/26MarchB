package patternProgram;

public class Eg1 {

	public static void main(String[] args) 
	{
		// * * * *
		// * * * *
		// * * * *
		// * * * *
		
		for(int i=1; i<=4; i++)  // outer loop
		{
			for(int l=1; l<=4; l++)   // inner loop
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		
		// * 
		// * * 
		// * * * 
		// * * * *
		// * * * * *
		
		int star=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;			
		}
		
		System.out.println("=====================");
		
		// * * * * *
		// * * * *
		// * * * 
		// * *
		// *
		
		int Star=5;
		for(int k=1; k<=5; k++)
		{
			for(int m=1; m<=Star; m++)
			{
				System.out.print("* ");
			}
			System.out.println();
			Star--;
		}
		
		System.out.println("=====================");
		
		//     *
		//    * *
		//   * * * 
		//  * * * *
		// * * * * *
		
		int STAR=1;
		int space=5;
		
		for(int p=1; p<=5; p++)
		{
			for(int q=1; q<=space; q++)
			{
				System.out.print(" ");
			}
			for(int q=1; q<=STAR; q++)
			{
				System.out.print("* ");
			}
			
			System.out.println( );
			STAR++;
			space--;			
		}
		
		System.out.println("=====================");
		
		// * * * * *
		//  * * * *
		//   * * *
		//    * *
		//     *
		

		int STAR1=5;
		int space1=1;
		
		for(int p=1; p<=5; p++)
		{
			for(int q=1; q<=space1; q++)
			{
				System.out.print(" ");
			}
			for(int q=1; q<=STAR1; q++)
			{
				System.out.print("* ");
			}
			
			System.out.println( );
			STAR1--;
			space1++;

		}
	}

}
