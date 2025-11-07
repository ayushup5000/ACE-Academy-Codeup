/*Problem Statement: Flip the Switch
Input: nums = [1,0,0,1,1]  
Output: 2 (Flip two 0s or two 1s) */


public class Week2_Task3 {
	public static int minFlip(int nums[]) {
		int count0=0,count1 =0;
		for (int num:nums){
			if(num ==0){	
			count0++;
			}
			else {
				count1++;
			}
		}
		 return Math.min(count0, count1);
	}
	public static void main (String [] args){
	int nums[] = {1,0,0,1,1};
		System.out.println("Output: " + minFlip(nums));
	}
}