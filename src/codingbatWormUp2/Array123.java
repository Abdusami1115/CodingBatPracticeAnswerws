package codingbatWormUp2;

import java.util.Arrays;

public class Array123 {

	public static void main(String[] args) {
		
	
	}
	public boolean array123(int[] nums) {
		for(int i =0 ; i < nums.length-2;i++) { 
		
		if(i>2 && (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3)) {	 
			return true;
		}	
	
	}

		return false;
}
}