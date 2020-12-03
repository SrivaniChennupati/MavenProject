package Week1.First;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int a = 0 ; int b=1; 
		int  c ;
		int n= 8;
		
		for (int i=1 ;i<=n ;i++)
		
		{
			System.out.println(a);
			
		    c = a+b ;
			
			 a = b ;
			
			b = c ;
			
		}
				
	}

}
