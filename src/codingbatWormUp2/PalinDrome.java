package codingbatWormUp2;

public class PalinDrome {

	public static void main(String[] args) {
		checkPalinDrome("kayak");
		checkPalinDrome("malayalam");
		checkPalinDrome("GeeksforGeeks");
		

	}
	public static void checkPalinDrome(String str) {
		String reverse = new StringBuffer(str).reverse().toString();
		if(str.equals(reverse)) {
			System.out.println("yes");
	
		}
		else {
			System.out.println("No");
		}
	}

}
