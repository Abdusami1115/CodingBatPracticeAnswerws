package codingbatWormUp2;

public class DoubleX {

	public static void main(String[] args) {
	boolean result = doubleX("axxxxbxx");
	System.out.println(result);

	}
    public static boolean doubleX(String str) {
		
		for(int i =0; i < str.length()-1;i++) {
			
		if(str.charAt(i)=='x') {
			if (str.charAt(i+1)=='x') {
				return true;
			}
			else 
		 return false;
		}
  
		
    }
		return false;
}
    }