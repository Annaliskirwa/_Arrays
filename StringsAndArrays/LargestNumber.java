// You are given an integer array nums where the largest integer is unique.

//Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.


//fails at index 0
// class Solution {
//     public int dominantIndex(int[] nums) {
//     int maxNum = Integer.MIN_VALUE,maxIndex=0;
// 		for(int i=0;i<nums.length;i++) {
// 			if(nums[i] > maxNum) {
// 				maxNum = nums[i];
// 				maxIndex = i;
// 			}
// 		}
		
// 		for(int j=0;j<nums.length;j++) {
// 			if(j!=maxIndex) {
// 				if(nums[j]*2 <= maxNum) continue;
// 				else return -1;
// 			}
// 		}
		
// 		return 1;
        
//     }
// }

class Solution {
     public int dominantIndex(int[] nums) {

        int max= Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        
        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max){
                resultIndex = i;
                continue;
            }

            if (nums[i] * 2 > max) {
                return -1;
            }
        }

        return resultIndex;
    }
}
 
