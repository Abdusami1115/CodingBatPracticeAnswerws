package codingbatWormUp2;

public class Array66OR67 {

	public static void main(String[] args) {
		

	}
	public  static int array667(int[] nums) {
		
		int counter = 0;
		for(int i = 0; i < nums.length-1; i++) {
			if((nums[i]== 6 && nums[i+1]== 6) || (nums[i]== 6 && nums[i+1]== 7)) {
				counter++;
		}
		  
	}
		return counter;
}
}