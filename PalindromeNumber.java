/**
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.
*/

//Used a temp variable

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        int dig;
        while(x > 0){
           dig = x % 10;
            rev = rev * 10 + dig;
            x = x / 10;
        }
        return temp == rev;
        
    }
}
