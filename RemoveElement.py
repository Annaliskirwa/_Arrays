# Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        for i in nums [:]:
            if i == val:
                nums.remove(i)
        return len(nums)