package Week1.day2;

public class SwappingwithoutThirdVariable {

	public static void main(String[] args) {
		 
		
		int x=10,y=20 ;
		
		System.out.println("Before swap:");
		
		System.out.println("x value: "+x);
		
		System.out.println("y value: "+y);
		
		x = x+y;
		
		y=x-y;
		
		x=x-y;
		
		System.out.println("After swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		

	}

}
