package codingbatWormUp1;

public class MixStart {

	public static void main(String[] args) {
		boolean str = mixStart("pixsnax");
		System.out.println(str);
		

	}
	public static boolean mixStart(String str) {
		if(str.startsWith("ix", 1))
			return true;
		else
			return false;
	}
}
