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

//above approach failed at some test cases
// Was not able to find the maximum count, so i introduced a variable to store the maximum count.
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count += 1;
                res = Math.max(count,res);
            }
            else{
                count = 0;  
            }
          
        }
        return res;
        
    }
}
