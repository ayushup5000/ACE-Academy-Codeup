/*Problem Statement: The Odd One Out 
Input nums = [2,3,5,4,5,3,2] 
Output: 4 */

public class Week2_Task4 {
	public static int commonElement(int nums[]){
		int result =0;
		for (int num:nums){
			result = result ^ num;
		}
		return result;
	}
	public static void main (String[] args){
		int nums[] = {2,3,4,5,4,3,2};
		System.out.println("Output: " + commonElement(nums));
	}
}