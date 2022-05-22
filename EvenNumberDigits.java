// Given an array nums of integers, return how many of them contain an even number of digits.

//my solution is loop through the array of integers
// pick the element at a specific index and convert to string
// check the length of the string and divide by 2
// if even increase count
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            String s = Integer.toString(num);
            if (s.length() % 2 == 0){
                count += 1;
            }
        }
        return count;
        
    }
}
