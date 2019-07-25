package codingbatWormUp1;

public class RangeOf304050 {

	public static void main(String[] args) {
		boolean result = in3050(30,41);
		System.out.println(result);
	

	}
	public static boolean in3050(int a, int b) {
		if((a>=30 && a<=40 && b>=30 && b<=40) || (b>=40 && b<=50 && a>=40 && a<=50))
			return true;
		
		else
			return false;
		  
	}
}
