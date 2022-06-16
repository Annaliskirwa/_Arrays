/**
A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

 

*/

//My approach is:
//Initiliaze len and count and a new array
//copy the value of the given array to the created array
//sort the created array
//check if values at their indexes match
//if not increment count
//return count

class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int count = 0;
        int[] arr = new int[len];
        for (int i = 0; i<len; i++){
           arr[i] = heights[i];
        }
        Arrays.sort(arr);
       
        for (int i = 0; i<len; i++){
            if (heights[i] != arr[i]){
                count ++;
            }
        }  return count; 
    }
}


