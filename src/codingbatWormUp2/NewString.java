package codingbatWormUp2;

public class NewString {

	public static void main(String[] args) {
	String x = stringBits("heeeello");
	System.out.println(x);

	}
	public static String stringBits(String str) {
		String temp = "";
		for(int i =0 ; i < str.length(); i +=2) {
			 temp += str.charAt(i);
		}
		return temp;
		

		  
	}
}
