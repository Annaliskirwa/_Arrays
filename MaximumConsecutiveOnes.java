// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// if i meet a non 1 i reset the counter to 0

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count += 1;
            }
            else{
                count = 0;  
            }
          
        }
        return count;
        
    }
}
