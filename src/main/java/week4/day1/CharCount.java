package week4.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		
		String S1 = "SRIVANICHENUPATI" ;
		
		char Ch = 'I' ;
		
		int Count =0 ;
		
		
	    char[] Ch1 = S1.toCharArray();
	    
	    Map <Character,Integer> map = new LinkedHashMap<Character,Integer>();
	    
	    
	     for (char c : Ch1) {
	    	 
	    	 if (c==Ch)
	    		 
	    	 {
	    		 
	    		 Count++ ;
	    	 }
			
	    	 
	    	
		}
		
	     map.put(Ch,Count );
    	 
    	 System.out.println(map);
	}
	
	}


