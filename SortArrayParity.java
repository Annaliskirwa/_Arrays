/**
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
*/

/**
my approach: create a new array and a variable to track its growthh
loop through the array, add even elements first to the new array
then add the odd elements
*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] newnums = new int[nums.length];
        int n = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i]%2==0){
                newnums[n++] = nums[i];
            }
        }
        for(int i = 0; i< nums.length; i++){
            if(nums[i]%2==1){
                newnums[n++] = nums[i];
            }
        }
        return newnums;
        
    }
}
