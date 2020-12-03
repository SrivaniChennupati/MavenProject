package Week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String S = "SRIVANI";
		
		int length = S.length();
	
		 String Rev = "" ;
		 
		 
		 for (int i = length-1 ;i >= 0 ;i--	)
		 {
				 Rev = Rev + S.charAt(i);			
		 }
		
		 System.out.println(Rev);
		 
		 if ( S.equals(Rev) )
			 
		 {
			 
			 System.out.println( S + " palindrome");
		 
		 }
		 else 
		 
			 
			 System.out.println( S+ "  is not a palindrome");
		 
			 
			 
	}
}
