package codingbatWormUp1;

public class IcyHotQuestion {

	public static void main(String[] args) {
		boolean result = icyHot(120,-1);
		System.out.println(result);

	}
	public static boolean icyHot(int temp1, int temp2) {
		
		if(temp1<0 && temp2 >100) 
			return true;
		if(temp1>100 && temp2 <0) 
			return true;
		else 
			return false;
		
		  
	}
}
