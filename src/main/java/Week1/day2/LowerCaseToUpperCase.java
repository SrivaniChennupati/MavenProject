package Week1.day2;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		
		String S = "srivani" ;
		
		char[] Ch = S.toCharArray();
		
		System.out.println(Ch.length);
		
		for (int i=0 ; i<= Ch.length-1 ; i++)
		{
			Ch[i] = (char) (Ch[i] -32) ;
		
	
			System.out.println(Ch[i]) ;
		}
		
		
		
	}

}
