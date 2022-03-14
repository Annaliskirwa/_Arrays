# Given an array of integers arr, return true if and only if it is a valid mountain array.

class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        if len(arr)<3 or arr[0]>arr[1]: return False
        for i in range(len(arr)-1):
            if arr[i]==arr[i+1]: return False
            if arr[i]>arr[i+1]: arr=arr[i:] ; break
        for j in range(len(arr)-1):
            if arr[j]<=arr[j+1]: return False
        return True



# Tranverse array from both sides
class Solution(object):
    def validMountainArray(self, A):
        N = len(A)
        i = 0

        # walk up
        while i+1 < N and A[i] < A[i+1]:
            i += 1

        # peak can't be first or last
        if i == 0 or i == N-1:
            return False

        # walk down
        while i+1 < N and A[i] > A[i+1]:
            i += 1

        return i == N-1