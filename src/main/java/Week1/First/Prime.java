package Week1.First;

public class Prime {
	
	// prime means number should be divisible by 1 and itself (it should have 2 factors )

	public static void main(String[] args) {
		
		int n = 16 ; int Count =0 ;
		
		for (int i=1 ; i<= n;i++)
		{ 
		
			if (n%i == 0)
			{
				Count++ ;
			}
		}
	
   if (Count==2)
   {
	   System.out.println( n+ "is prime");
   }
   else 
   {
	   System.out.println( n+ "  is not a prime");
   }
   }
}
