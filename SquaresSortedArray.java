// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

//how i did :
// Created an array list
// tranversed the array and addeed  the squares of the elements in te arraylist
//converted the array list back to the expected array elements.


class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List <Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++){
            num.add(nums[i] * nums[i]);
        }
        int [] arr = new int[num.size()];
        for (int i = 0; i < num.size(); i++)
            arr[i] = num.get(i);
        return arr;
    }
}
