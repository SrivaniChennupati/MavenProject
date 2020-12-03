package week4.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		
		String S = "SRIVANICHENNUPATI" ;
		
		char[] Ch = S.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for (char c : Ch) {
			
			
			if (map.containsKey(c))
				
			{
				Integer integer = map.get(c);
				
				map.put(c, integer+1);
				
			}
			
			else 
			{
				
				map.put(c, 1);
				
		
			}
		
		}
			
		System.out.println(map);

	}

}
