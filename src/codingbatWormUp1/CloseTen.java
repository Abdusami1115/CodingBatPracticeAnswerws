package codingbatWormUp1;

public class CloseTen {

	public static void main(String[] args) {
int x = close10(13,13);
System.out.println(x);

	}
	public static int close10(int a, int b) {
		int temp1 = Math.abs(a-10);
		int temp2 = Math.abs(b-10);
		if(temp1==temp2)
			return 0;
		if(temp1>temp2)
			return b;
		else
			return a;
			
		
	}
}
