# Implement strStr().

# Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

# My first approach
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if (haystack == []):
            return -1
        if (needle in haystack):
            k = needle[0]
            return haystack.index(k)
        else:
            return 0

# failed some test cases

# correct approach
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle in haystack:
            return haystack.index(needle)
        return -1