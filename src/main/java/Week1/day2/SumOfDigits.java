package Week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		
		
		int n= 132; int temp; int rem ; 
		
		temp = n;
		
		int sum =0 ;
		
		 while (temp>0)
		 {
			 rem = temp%10 ;
				
				sum = sum + rem ;
				
				temp = temp/10 ;
			 
		 }
		
		 
		 System.out.println("sum of the digits is " +sum) ;
		
		
		
		
		

	}

}
