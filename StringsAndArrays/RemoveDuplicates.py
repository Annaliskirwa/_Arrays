# Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.


# using index and length
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        length = 1
        previous = nums[0]
        index = 1
        for i in range (0, len(nums)):
            if nums[i] != previous:
                length += 1
                previous = nums[i]
                nums[index] =  nums[i]
                index += 1
        return length
        