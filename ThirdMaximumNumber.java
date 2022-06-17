// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

//Approach:
/**
Sort the given array
Remove duplicates
Return third max if size > 3 else maximum
*/

class Solution {
    public int thirdMax(int[] nums) {
        int lengthss = nums.length;
        int k = 0;
        Arrays.sort(nums);
        ArrayList<Integer> nums1 = new ArrayList<>();
        for (int i = 0; i<lengthss; i++){
            nums1.add(nums[i]);
        }
        if(nums1.size()>=3)
        {
            return nums1.get(nums1.size()-3);
         }
        else
        {
            return nums1.get(nums1.size()-1);
        }
    }
}
