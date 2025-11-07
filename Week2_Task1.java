//Problem Statement:The Efficient Traveler 
/*Input: nums = [4, 2, 6, 3, 5] 
         initialEnergy = 10 */
// Output: 2

public class Week2_Task1 {
	public static int farthestcity (int nums[],int initialEnergy){
		int  Currentenergy = initialEnergy; 
		for(int i = 1; i < nums.length; i++){
			 Currentenergy = Currentenergy - nums[i];
			
			if(Currentenergy<0){
				return i-1;
			}
		}
		     return nums.length -1;
	}		 
		
		public static void main (String[] args){
		int nums[]=  {4,2,6,3,5};
			int initialEnergy =10;
			int result = farthestcity( nums,initialEnergy);
			
			System.out.println("Output: " + result);
		}
	
}