package codingbatWormUp2;

public class FrontTimes {

	public static void main(String[] args) {
	String str = frontTimes("ch",4);
	System.out.println(str);
	
	}
	public static String frontTimes(String str, int n) {
		
		String tempA= "";

		 if(str.length()>=3)
		  
		 for(int i = 0; i<n; i++) 
			 tempA += str.substring(0, 3);
		 
		else 
			for(int i = 0; i<n; i++) 
			tempA +=str;
		 return tempA;
	}

}
