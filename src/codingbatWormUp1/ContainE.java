package codingbatWormUp1;

public class ContainE {

	public static void main(String[] args) {
		boolean n = stringE("heeeello");
		System.out.println(n);


	}
	public static boolean stringE(String str) {
		int counter = 0;
		for(int i = 0; i< str.length(); i++) 
			if(str.charAt(i)== 'e')
				counter++;
			if(counter >=1 && counter <=3)
				return true;
				
			else	
		         return false;
		  
	}
}
