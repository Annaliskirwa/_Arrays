# Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.


class Solution:
    def reverseWords(self, s: str) -> str:
        
        return (' '.join([i[::-1] for i in s.split()]))



# using temp
class Solution:
    def reverseWords(self, s: str) -> str:
        # return (' '.join([i[::-1] for i in s.split()]))
        temp = s.split(" ")
        result = ""
        for word in temp:
            word = word[::-1]
            result += word + " "
        return result[:-1]