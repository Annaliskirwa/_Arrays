# Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

# Using a hash set
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        
        N = len(nums)
        nums_set = set(nums)
        
        return [i for i in range(1, N + 1) if i not in nums_set]
            
        

        