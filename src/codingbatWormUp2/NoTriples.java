package codingbatWormUp2;

public class NoTriples {

	public static void main(String[] args) {
		

	}
	public static boolean noTriples(int[] nums) {
		
	
		for(int i = 0; i < nums.length-2; i++) {
			if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) 
				
	  return false;
	
		
}
		return true;
}
}