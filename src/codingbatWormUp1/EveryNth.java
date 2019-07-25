package codingbatWormUp1;

public class EveryNth {

	public static void main(String[] args) {
		String str = everyNth("miracle",2);
		System.out.println(str);

	}
	public static  String everyNth(String str, int n) {
		String temp = "";
		int x = str.length();
		for(int i =0 ;i < x; i=i+n) 
		temp += str.charAt(i);
		return temp;
			
		  
	}

	}
