# Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.


# Two Pass
# Intuition and Algorithm

# Write all the even elements first, then write all the odd elements.


class Solution(object):
    def sortArrayByParity(self, A):
        return ([x for x in A if x % 2 == 0] +
                [x for x in A if x % 2 == 1])