# Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. 
# If there is no such subarray, return 0 instead.


# Sliding window approach 
class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        res = 0
        left, right = 0, 0
        numsum = 0
        lengths = []
        
        while right < len(nums):
            numsum += nums[right]
            
            while left <= right and numsum >= target:
                curr_len = right - left + 1
                lengths.append(curr_len)
                numsum -= nums[left]
                left +=1
                
            
            
            right +=1
        if lengths:
            res = min(lengths)
        else:
            res = 0
        return res