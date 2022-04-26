// Given two binary strings a and b, return their sum as a binary string.

class Solution {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
    }
}
// the above code returns a runtime error
// solutionn using carry
class Solution {
    public String addBinary(String a, String b) {
        int length1 = a.length();
        int length2 = b.length();
        int carry = 0;
        String res = "";
        int maxLen = Math.max(length1, length2);
        for (int i = 0; i<maxLen; i++){
            int p = i < length1 ? a.charAt(length1 - 1 - i) - '0' : 0;
            int q = i < length2 ? b.charAt(length2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp/2;
            res = tmp%2 + res;
        }
        return (carry == 0) ? res : "1" + res;
        
    }
}
