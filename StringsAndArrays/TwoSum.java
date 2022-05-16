// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

class Solution {
public int[] twoSum(int[] nums, int target) {
int[] arr = new int[2];

    for (int i = 0, j = i + 1; i < nums.length && j < nums.length; i++, j++){
        if ((nums[i] + nums[j]) == target){
            arr[0] = i;
            arr[1] = j;
        }
    }
    
    return arr;
}
}
