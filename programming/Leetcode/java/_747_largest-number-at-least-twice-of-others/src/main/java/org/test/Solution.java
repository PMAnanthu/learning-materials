package org.test;

class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }

        for(int i=0;i<n;i++){
            if(i!=maxIndex && nums[i]*2 > max){
                return -1;
            }
        }
        return maxIndex;
    }
}