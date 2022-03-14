# Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        # k = nums[-1]
        # return nums[-1]
        return sorted(set(nums))[::-1][2] if len(set(nums)) >= 3 else sorted(set(nums))[::-1][0] 
