# Given a binary array nums, return the maximum number of consecutive 1's in the array.
class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count, res = 0, 0 
        for num in nums:
            if num == 1:
                count +=1
                res = max(res, count)
                
            else:
                count = 0
        return res