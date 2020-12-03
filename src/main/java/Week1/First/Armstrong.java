package Week1.First;

public class Armstrong {

	public static void main(String[] args) {
		
		int n = 222 ;
		
		// keep the number into one temperory variable //
		
		 int temp = n ; 
		 int remainder , sum =0 ;
		 
		 while(temp>0)
		 {
			 
			 remainder = temp%10 ;
			 
			 // 3 = 153%10//
			 
			 
			 sum = (int) (sum + Math.pow(remainder, 3));
			 
			// 27 = 0+  (3*3*3)
	
			 
			 temp = temp/10 ;
			 
			 //  temp = 153/10 
			 // temp = 15 
			 
		 }
		 
		 if ( sum == n)
			 
		 {
			 
			 System.out.println(n  + " is an Armstrong number." );
		 }
           
		 else
			 
			 System.out.println( n  + " is not an Armstrong number." );
	}

}
