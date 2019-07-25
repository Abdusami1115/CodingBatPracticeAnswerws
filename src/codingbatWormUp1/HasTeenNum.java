package codingbatWormUp1;

public class HasTeenNum {

	public static void main(String[] args) {
		boolean result = hasTeen(21,15,34);
		System.out.println(result);
		
		


	}
	public static boolean hasTeen(int a, int b, int c) {
		
		if(a>=13 && a<=19) 
			return true;
		if(b>=13 && b<=19) 
			return true;
		if(c>=13 && c<=19) 
			return true;
		else {
			return false;
		}
		
		  
	}
}
