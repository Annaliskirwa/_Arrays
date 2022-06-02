/**
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.
*/

/**
My approach is:
set a maximum as -1 (the last element will retain this(because):
then i lopp theough the array from the end
keep the maximum value so far in a temp var
replace element[index] with the maximum value so far
return array
*/


class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length-1; i>=0; i--){
            int tempMax = arr[i];
            arr[i] = max;
            max = Math.max(tempMax, max);
        }
        return arr;
    }
}

 
