package codingbatWormUp1;

public class LastDigit {

	public static void main(String[] args) {
		boolean x = lastDigit(34,764);
		System.out.println(x);

	}
	public static boolean lastDigit(int a, int b) {
		int remainderA = a%10;
		int remainderB = b%10;
		if(remainderA==remainderB)
			return true;
		else
			return false;
		
		
		
	}


}
