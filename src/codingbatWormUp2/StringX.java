package codingbatWormUp2;

public class StringX {

	public static void main(String[] args) {
		
System.out.println(stringX("x"));
	}
	
	public static String stringX(String str) {
		if(str.length()<2)
			return str;
	
		char start = str.charAt(0);
		char end = str.charAt(str.length()-1);
		String mid = str.substring(1, str.length()-1).replace("x", "");
		return start + mid + end;
		
		
	}
}