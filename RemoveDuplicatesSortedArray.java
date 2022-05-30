/**
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same.
*/

/**
My approach is:
get the length of the array
transvers teh array, if value at current index equals to next element
remove the element
reduce the length

*/


class Solution {
    public int removeDuplicates(int[] nums) {
        int lengths = nums.length;
        for (int i = 0; i < lengths; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[lengths -1];
                i--;
                lengths--;
            }
        }
        return lengths;
        
    }
}
