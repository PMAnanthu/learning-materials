package org.test;

class Solution {
    public int jump(int[] nums) {
        int answer=0;
        int n=nums.length;
        int currentEnd=0,currentFar=0;

        for(int i=0;i<n-1;i++){
            currentFar=Math.max(currentFar,i+nums[i]);

            if(i==currentEnd){
                answer++;
                currentEnd=currentFar;
            }
        }
        return answer;
    }
}