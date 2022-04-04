# Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

# One lin eusing sorted method
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        return sum([num for num in sorted(nums)[::2]])



# First approach, more time and space complexity
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        
        thesum = []
        
        for i in range(0, len(nums), 2):
            thesum += [nums[i]]
            
        return sum(thesum)