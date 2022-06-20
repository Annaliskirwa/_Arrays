/**
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
*/


/**
My approach is to use sets and a list.
Copy the array into a set
Find the number that isnt in the set
Push that number to a list
Return the list
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set nums1 = new HashSet();
        List nums2 = new ArrayList();
        for(int m: nums){
            nums1.add(m);
        }
        for(int i = 1; i<= nums.length; i++){
            if(!nums1.contains(i)){
                nums2.add(i);
            }
        }
        return nums2;
        
    }
}

