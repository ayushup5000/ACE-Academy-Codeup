/*Problem Statement: The Sum That Stands Out 
 Input: nums = [2, 3, -1, 8, 4]  
 Output: 3 */


public class Week2_Task2 {
	public static int findIndex(int nums[]) {
		int suffix = 0;
		
		for(int num:nums) {
			suffix += num;
		}
		int prefix =0;
		for(int i =0; i<nums.length;i++){
			suffix -= nums[i];
			
			if(prefix == suffix)
				return i;
			prefix += nums[i];
			
		}
		return -1;
	}
	
	public static void main (String [] args){
	int nums[] = {2,3,-1,8,4};
		System.out.println("Output: " + findIndex(nums));
	}
    
}
