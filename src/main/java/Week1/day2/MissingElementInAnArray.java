package Week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,7,6,8};

		Arrays.sort(a);
		

		
		for (int i=1 ;i<= a.length;i++) 
		{
		 
			 if ( i != a[i-1]) 
			 {
				 System.out.println( i);
				 break;
			 }
			
			
        }
		

	}

}
