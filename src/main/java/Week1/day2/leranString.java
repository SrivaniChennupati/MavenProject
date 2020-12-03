package Week1.day2;



public class leranString {

	public static void main(String[] args)
	{
		
		String  S =  " SRIVANI CHENNUPATI VENKATESWARLU"  ;
		
		//toCharArray () 
		
		
		 char[] ch  = S.toCharArray();
		 
		  System.out.println(ch.length);
		  
		  for (int i= 0 ; i<= ch.length-1 ; i++)
			  
		  {
			  
			  System.out.println(ch[i]);
		  }
				
		// length / Count 
		  
		  System.out.println(ch.length);
		  
		  //  charAtOf(Index)
		  
		  
	     char ch1 = S.charAt(1);
	
		System.out.println(ch1);
	
	    //subString(begin Index , end Index)
		   
		             String substring = S.substring(4, 7);
		             
		             System.out.println(substring);
		    
		  // trim 
		             
		             String trim = S.trim();
		 
	        
		             System.out.println(trim );
		             
		  // Split 
		             
		             String[] split = S.split(" ");
		             
		             for (int i=0 ;i<= split.length-1 ;i++)
		             {
		            	if (split[i].endsWith("I"))
		            		
		            		System.out.println(split[i]);
		            		
		             }
		   
		             //indexOf(char)// lastIndexOf(char)
		             
		             
		             int indexOf = S.indexOf('I');
		             
		             System.out.println(indexOf);
		             
		           int lastIndexOf = S.lastIndexOf("I");
		           
		           System.out.println(lastIndexOf);
		           
		           // replace (old character , new character )
		           
		           String replace = S.replace("S","v");
		           
		           System.out.println(replace);
 
		           
		           // Concatenate
		           
		           String concat = S.concat("SRIVANI");
		           
		           System.out.println(concat);
		           
		           
  
                 

}
}
