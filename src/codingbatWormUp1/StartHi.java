package codingbatWormUp1;

public class StartHi {

	public static void main(String[] args) {
	boolean str = starthi("himyfriend");
	System.out.println(str);

	

	}
	public static boolean starthi(String str) {
		
		if(str.startsWith("hi"))
			return true;
		else {
			return false;
		}
	}

}
