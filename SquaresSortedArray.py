# Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        k = []
        for i in range(0, len(nums)):
            k.append(nums[i] * nums[i])
        return sorted(k)
    