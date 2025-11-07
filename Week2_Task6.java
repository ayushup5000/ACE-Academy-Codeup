/* Problem Statement: The Minimalist Painter 
Input: time = [4, 2, 3, 7] 
Output: 9 */


public class Week2_Task6{
	public static int minStrokes(int nums[]){
		if (nums.length==0){
			return 0;
			
		}
		int strokes = 1;
		for(int i = 1; i<nums.length;i++){
		if (nums[i] != nums[i-1]){
			
			strokes++;
		}
		}
		return strokes;
	}
	public static void main (String[] args){
		int nums[] = {4,2,3,7};
		System.out.println("Output: " + minStrokes(nums));
	}
}
