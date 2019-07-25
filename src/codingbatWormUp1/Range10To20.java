package codingbatWormUp1;

public class Range10To20 {

	public static void main(String[] args) {
		boolean result = in1020(9,54);
		System.out.println(result);

	}
	public static boolean in1020(int a, int b) {
		if(a>=10 && a<=20 )
			return true;
		
		if(b>=10 && b<=20 )
			return true;
		else {
			return false;
		}
	}
	
}
