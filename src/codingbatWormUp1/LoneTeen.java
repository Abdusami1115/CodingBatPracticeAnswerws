package codingbatWormUp1;

public class LoneTeen {

	public static void main(String[] args) {
	boolean result =loneTeen(13,13);
	System.out.println(result);

	}
	public static boolean loneTeen(int a, int b) {
		if((a>=13 && a<=19) && (b<13 || b>19)&& (a !=b))
			return true;
		if((b>=13 && b<=19) &&(a<13 || a>19) &&(a !=b))
			return true;
		else {
			return false;
		}
				
		  
	}
}
