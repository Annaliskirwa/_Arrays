/**
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
*/

/**
Check the edge cases
get the length of the array
create an array list to store transversed elements
tranverse and store in array list
check if an array at a certain position * 2 == a value in the list
return true
return false
*/

class Solution {
    public boolean checkIfExist(int[] arr) {
        int lengths = arr.length;
        ArrayList<Integer> arra = new ArrayList();
        if (arr == null || lengths  == 0){
            return false;
        }
        for (int i = 0; i< lengths; i++){
            arra.add(arr[i]);
        }
        for (int i = 0; i < lengths; i++){
            if (arra.contains(arr[i]/2) && (arr[i]%2==0)){
                return true;
            }
        }
        return false;
    }
}

//failed some test cases 
class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr == null){
            return false;
        }
        for(int i = 0; i < arr.length; i++){
            int target = arr[i]*2;
            for(int j = 0; j< arr.length; j++){
                if(i!=j && target == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}




