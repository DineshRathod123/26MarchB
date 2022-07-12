package patternProgram;

public class Eg2 {

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		
		int star=5;   // count total no. of star in first row
		
		for(int i=1; i<=9; i++)    // outer loop use for no. of rows
		{
			for(int j=1; j<=star; j++)  // inner loop for column
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}

	}

}
