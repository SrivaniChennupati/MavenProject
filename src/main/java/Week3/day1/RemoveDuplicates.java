package Week3.day1;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		// Declare a string as PayPal India 
		
		String S1 = " Paypal India" ;
		
		//Output : YLi
		
		//Convert it into a character array
		
		char[] Ch = S1.toCharArray();
		
		//Declare a Set as charSet for Character
		
		Set<Character> CharSet = new LinkedHashSet<Character>();
		
		Set<Character> DuplicateCharset = new  LinkedHashSet <Character> ();
		
		for (Character eachChar : Ch){
			
			if (!CharSet.add(eachChar))
				
			{
				
			DuplicateCharSet.add(eachChar)
			
		}
		
		
			
			
			
		}
		
		 
		

	}

}
