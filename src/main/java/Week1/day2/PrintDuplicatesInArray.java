package Week1.day2;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) 
	{
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//System.out.println(a.length);
		Arrays.sort(a);
		
		 for (int i=0 ; i< a.length -1  ;i++)
			 
		 {
			 
			
				 
		   if(a[i] == a[i+1])
		
		   {
			   
			   System.out.println(a[i]);
		   }
		 }
		
		

	}

}
