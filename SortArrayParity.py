# Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.


# Two Pass
# Intuition and Algorithm

# Write all the even elements first, then write all the odd elements.


class Solution(object):
    def sortArrayByParity(self, A):
        return ([x for x in A if x % 2 == 0] +
                [x for x in A if x % 2 == 1])



# In-Place
# Intuition

# If we want to do the sort in-place, we can use quicksort, a standard textbook algorithm.

class Solution(object):
    def sortArrayByParity(self, A):
        i, j = 0, len(A) - 1
        while i < j:
            if A[i] % 2 > A[j] % 2:
                A[i], A[j] = A[j], A[i]

            if A[i] % 2 == 0: i += 1
            if A[j] % 2 == 1: j -= 1

        return A
