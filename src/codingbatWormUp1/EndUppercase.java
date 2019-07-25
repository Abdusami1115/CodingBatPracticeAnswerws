package codingbatWormUp1;

public class EndUppercase {

	public static void main(String[] args) {
	String str = endUp("he");
	System.out.println(str);

	}
	public static String endUp(String str) {
		if(str.length()< 3)
			return str.toUpperCase();
		String untilLast3 = str.substring(0, str.length()-3);
		String last3= str.substring(str.length()-3, str.length());
		return untilLast3 + last3.toUpperCase();
		
		
	}
}
