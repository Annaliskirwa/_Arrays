# You are given an integer array nums where the largest integer is unique.

# Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.



class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 0
        largest = max(nums)
        index = nums.index(largest)
        nums.remove(largest)
        second_largest = max(nums)
        return -1 if second_largest *2 > largest else index
        
        