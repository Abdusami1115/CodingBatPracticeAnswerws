package codingbatWormUp1;

public class MoltipleOf5Or3 {

	public static void main(String[] args) {
		boolean result = or35(3);
		System.out.println(result);

	}
	public static boolean or35(int n) {
		if(n % 3 == 0 || n % 5==0 ) {
			return true ;}
			else 
				return false;
		}
	}

