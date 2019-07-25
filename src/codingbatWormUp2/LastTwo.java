package codingbatWormUp2;

public class LastTwo {
	
	public static void main(String[] args) {
		
		System.out.println(last2("axxxxhxx"));
		
	}
	public  static int last2(String str) {
		if(str.length()<2) {
			return 0;
		}
		
		int counter = 0;
		for(int i = 0; i<str.length()-1; i++) {
			if(str.substring(i,i+2).equals(str.substring(str.length()-2, str.length()))) {
			counter++;
		
				
			
			}	

	}
		return counter-1;
	}
}