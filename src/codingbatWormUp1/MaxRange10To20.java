package codingbatWormUp1;

public class MaxRange10To20 {

	public static void main(String[] args) {
		int n = max1020(11,19);
		System.out.println(n);
		

	}
	public static int max1020(int a, int b) {
		int tempa;
		int tempb;
		if(a<=20 && a>=10)
			tempa=a;
		else
			tempa = 0;
			
		if(b<=20 && b>=10)
			tempb=b;
		else
			tempb = 0;
		return Math.max(tempa, tempb);
		
		  
	}
}
