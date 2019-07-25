package codingbatWormUp1;

public class FrontBack {

	public static void main(String[] args) {
		String str = backAround ("Hello");
		System.out.println(str);
	}
	public static String backAround (String str) {
		
		String last = str.substring(str.length()-1);
		return last+ str +last;
		
		  
	}
}
