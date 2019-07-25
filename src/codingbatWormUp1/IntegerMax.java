package codingbatWormUp1;

public class IntegerMax {

	public static void main(String[] args) {
		int max = intMax(3,17,9);
		System.out.println(max);

	}
	public static int intMax(int a, int b, int c) {
		
		if(a>b && a>c)
			return a;
		if(b>a && b>c)
			return b;	
		else
			return c;
		
		  
	}

}
