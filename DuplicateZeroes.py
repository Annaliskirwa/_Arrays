# Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        k = []
        m = len(arr)
        for digit in arr:
            k.append(digit)
            if digit == 0:
                k.append(0)
        for index in range(m):
            arr[index] = k[index]