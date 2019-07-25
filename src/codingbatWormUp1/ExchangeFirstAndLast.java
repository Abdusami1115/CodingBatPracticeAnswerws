package codingbatWormUp1;

public class ExchangeFirstAndLast {

	public static void main(String[] args) {
		String str = exchangeFAndL("b");
		
		System.out.println(str);

	}
	public static String exchangeFAndL(String str) {
		if(str.length()<=1)
			return str;
		String mid = str.substring(1, str.length()-1);
		String afterChange = str.charAt(str.length()-1)+mid + str.charAt(0);
		return afterChange;
			
	}
}