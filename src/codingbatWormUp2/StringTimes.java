package codingbatWormUp2;

public class StringTimes {

	public static void main(String[] args) {
	String str = stringTimes("Hello",4);
	System.out.println(str);

	}
	public static String stringTimes(String str, int n) {
		String temp = "";
		for(int i = 0; i < n;i++) 
			temp += str;	
		return temp;
		  
	}
}
