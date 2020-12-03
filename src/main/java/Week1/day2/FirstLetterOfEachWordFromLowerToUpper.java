package Week1.day2;

public class FirstLetterOfEachWordFromLowerToUpper {

	public static void main(String[] args) {
		
		String S = "sRIVANI cHENNUPATI" ;
		
		// character after blank space specifies that begining of the new word 
		
		char[] Ch = S.toCharArray();
		
		System.out.println(Ch.length);
		
		
		Ch[0] = (char) (Ch[0] -32) ;
		
		System.out.println(Ch[0]);
		
		for (int i=1 ;i< Ch.length;i++)
		{
			
			if (Ch[i] == ' ')
				
			{
				
				Ch[i+1] = (char) (Ch[i+1]-32) ;
				
			}
			
			System.out.println(Ch[i]);
		}
				
				
		

	}

}
