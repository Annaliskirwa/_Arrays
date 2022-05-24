// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

// My approach is:
/*
Create an array list of integers
if the element at the index position is 0, add 0 twice
add the elements from the array to the array list
and then copy back the elements from the array list to the array's fixed length.
return the array
**/

class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int k = 0 ;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                arr1.add(0);
            }
            arr1.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            arr[k] = arr1.get(i);
            k++;
        }
    }
