

/**
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
*/

/**
My approach is 
get the length of the array
loop through the array looking for the value
if value found, decrement
decrement the array length
return array length

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
