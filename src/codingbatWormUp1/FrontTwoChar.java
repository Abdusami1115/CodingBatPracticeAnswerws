package codingbatWormUp1;

public class FrontTwoChar {

	public static void main(String[] args) {
		String str = front22("ki");
		System.out.println(str);


	}
	public static String front22(String str) {
		if(str.length() <= 2) {
			return str+str+str;}
		
		String frontTwo =str.substring(0, 2);
		return frontTwo+str+frontTwo;
		
		}
		  
	
	
}