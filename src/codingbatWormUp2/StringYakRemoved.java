package codingbatWormUp2;

public class StringYakRemoved {

	public static void main(String[] args) {
		System.out.println(stringYak("phakyakpakak"));

	}
	public static String stringYak(String str) {

		
		//String newStr = str.replace("k", "");
		//return newStr;
		//String yak =str.substring(str.indexOf("y"),(str.indexOf("k", str.indexOf("y"))+1));
		//return yak;
	
		
		String newStr = str.replace(str.substring(str.indexOf("y"),(str.indexOf("k", str.indexOf("y"))+1)), "");
		return newStr;
		
	
		  
	}
}
