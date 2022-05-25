/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
**/

/*
My aaproach is:
create an array list
store the elements of num1 and num2 in the array list
move the array list to num1
sort num1
**/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> arr = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < m; i++){
            arr.add(nums1[i]);
        }
        for (int i = 0; i < n; i++){
            arr.add(nums2[i]);
        }
        for (int i = 0; i < m+n; i++){
            nums1[k] = arr.get(i);
            k++;
        }
        Arrays.sort(nums1);
        
    }
}
