# Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

# Two sum 1
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a = list()
        for i in range(len(nums)):
            x = target - nums[i]
            if x in a:
                return [a.index(x),i]
            else:
                a.append(nums[i])



# Two sum 2

# Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        a = list()
        for i in range(len(numbers)):
            x = target - numbers[i]
            if x in a:
                return [a.index(x)+1,i+1]
            else:
                a.append(numbers[i])