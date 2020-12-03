package Week1.day2;

public class CovertStringWithSpacesFromLowerToUpperCase {

	public static void main(String[] args) {
		
		String S = "srivani chennupati" ;
		
		// converting space from lower to upper is of useless 
		
		char[] Ch = S.toCharArray();
		
		System.out.println(Ch.length);
		
		for (int i=0 ;i<= Ch.length-1 ;i++)
		{
			if (Ch[i] != ' ')
			{
				Ch[i] = (char) (Ch[i]-32) ;
			}
			
			System.out.println(Ch[i]);
		}
		
		

	}

}
