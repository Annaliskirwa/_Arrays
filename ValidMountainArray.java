//Given an array of integers arr, return true if and only if it is a valid mountain array.
/**
Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
*/

/**
Check the array length 
if less than 3 return false
if more than 3, start cgecking for strictly increasing
After finding the peak
Start checking for strictlty decreasing
remember, elemet at an index should not be the same as that of the previous index
*/
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        int n=arr.length;
        int i;
        for(i=0;i<n-1;i++){
            if(arr[i+1]==arr[i])
                return false;
            
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        if(i==n-1||i==0)
            return false;
        for(int j=i;j<n-1;j++){
            if(arr[j]<=arr[j+1])
                return false;
        }
        return true;
    }
}
