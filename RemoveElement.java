//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

/**
Get the size of the array
loop throught the array, checking for the value
if value is found, move to end of array
decrement array length
return lengths
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int lengths = nums.length;
        for(int i = 0; i< lengths; i++){
            if(nums[i] == val){
                nums[i] = nums[lengths -1];
                i--;
                lengths --;
            }
        }
        return lengths;
        
    }
}
