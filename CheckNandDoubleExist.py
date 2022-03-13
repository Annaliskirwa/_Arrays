# Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        for i in range(len(arr)):
            if (arr[i]*2 in arr[i+1:]) or (arr[i]/2 in arr[i+1:]): return True
        return False
        