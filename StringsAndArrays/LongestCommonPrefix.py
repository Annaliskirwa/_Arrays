# Write a function to find the longest common prefix string amongst an array of strings.

# If there is no common prefix, return an empty string ""

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""

        short_str = min(strs, key=len)

        for i, char in enumerate(short_str):
            for other in strs:
                if other[i] != char:
                    return short_str[:i]

        return short_str