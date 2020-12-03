package Week1.day2;

public class ReverseEvenWords {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		 String S = "VENKATESWARLU IS MY LOVE "; // original string 
	     String[] Split_array = S.split(" ") ; // splitting the string into multiple words
	     String  S1 = " " ;
	     int pos = 0; 
	     String Reversed_String = null; 
	     for (int  i=0; i<= Split_array.length-1; i++)
	     {
	      if (i%2 ==1)
	      {
	    	  char[] Reversed = Split_array[i].toCharArray();
	    	  for (int x=Reversed.length-1; x>=0; x--)
	    	  {
	    		  if (Reversed_String == null)
	    		  {
	    			  Reversed_String = Character.toString(Reversed[x]);
	    		  }
	    		  else 
	    		  {
	    			  Reversed_String = Reversed_String + Character.toString(Reversed[x]);
	    		  }
	    	  }
	    	  System.out.print(Reversed_String + ' ');
	    	  Reversed_String = null;
	      }
	      else
	      {
	    	  System.out.print(Split_array[i] + ' ');
	      }
	       
	     }
}
}

					
				
			
		
		

	

	
