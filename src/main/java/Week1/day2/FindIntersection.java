package Week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		
		int [] A = {2,3,6,7,9,11} ;
		
		Arrays.sort(A);
		
		int [] B = {4,6,8,9,12};
		
		Arrays.sort(B);
		
		for ( int i=0 ;i<= A.length-1;i++)
			
		{
		
			for (int j=0 ;j<= B.length-1;j++)
			{
				 
				if (A[i] == B[j])
				{
				System.out.println(A[i]);
				
			}
			
		}
		
  
	}

}

}