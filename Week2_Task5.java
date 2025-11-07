/*Problem Statement: Smart Pair Finder
Input nums = [3,5,1,7], k = 8  
Output: true */


import java.util.HashSet;
public class Week2_Task5 {
	public static boolean hasPair(int nums[],int k){
			HashSet<Integer>set =new HashSet<>();
			for (int num:nums){
				if (set.contains(k-num)){
					return true;
				}
				set.add(num);
			}
			return false;
	}	
	public static void main (String [] args){
	int [] nums = {3,5,1,7};
	int k = 8;
	System.out.println("Output: " + hasPair(nums,k));
	}
}