package codingbatWormUp2;

public class StringAddedGradully {

	public static void main(String[] args) {
		System.out.println(stringSplosion("adcbhgyf"));
		
		

	}
	public  static String stringSplosion(String str) {
		String temp = "";
		
		for(int i = 0;  i< str.length();i++) {
			temp += str.substring(0,i);
			
			
		}
		return temp;
		  
	}
}
