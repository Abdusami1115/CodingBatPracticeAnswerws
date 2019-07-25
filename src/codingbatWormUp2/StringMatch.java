package codingbatWormUp2;

public class StringMatch {

	public static void main(String[] args) {
		System.out.println(stringMatch("xxcaazz", "xxbaaz"));

	}
	public static int stringMatch(String a, String b) {
		int len = Math.min(a.length(), b.length());
		int counter=0;
		for(int i =0; i < len-1;i++)
			
		if(a.substring(i, i+2).equals(b.substring(i, i+2))) {
			counter++;
			}
		return counter; 
	}

}
