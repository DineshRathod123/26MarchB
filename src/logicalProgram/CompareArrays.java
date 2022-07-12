package logicalProgram;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args)
	{
		int ar1[]= {12,14,16};
		int ar2[]= {20,24,26};
		int ar3[]= {12,14,16};
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar1, ar3));
		System.out.println(Arrays.equals(ar3, ar2));

	}

}
