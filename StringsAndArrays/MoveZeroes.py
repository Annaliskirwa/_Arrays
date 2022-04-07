# Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

# Note that you must do this in-place without making a copy of the array.


# using pop and append methods
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in range(len(nums)-1, -1, -1):
            if (nums[i] == 0):
                nums.pop(i)
                nums.append(0)



# using pointers
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        pos = 0
        
        for i in range(len(nums)):
            el = nums[i]
            if el != 0:
                nums[pos], nums[i] = nums[i], nums[pos]
                pos += 1