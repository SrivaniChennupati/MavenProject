package Week1.day2;

public class ChangeOddIndextoUpperCase {

	public static void main(String[] args)
	{
		String S = "srivanichennupati" ;
		
		         char[] Ch  = S.toCharArray();
		        
		        System.out.println(Ch.length) ;
		        
		        for ( int i= 0 ; i<= Ch.length -1 ; i++)
		        	
		        {
		        	
		        	if(i%2 == 1)
		        		
		        	{
		        		// we use Asci table here : a = 97 , A= 65 ; lowercase-32 = upper case 
		        		
		        		
		           Ch[i] = (char) ( Ch[i]-32) ;
		           
		           
		        	       
		        	}
   
		        		
		        		
		        	
		        		System.out.println(Ch[i]);
		        	
		        }
		  
		
		
		

	}

}
