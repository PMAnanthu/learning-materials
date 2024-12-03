package org.test;

class Solution1 implements Solution{
    public int findMiddleIndex(int[] nums) {
        int answer=-1;
        for(int i=0;i<nums.length;i++){
            int leftSum=sum(nums,0,i);
            int rightSum=sum(nums,i+1,nums.length);
            if(leftSum==rightSum){
                answer=i;
                break;
            }
        }
        return answer;
    }

    public int sum(int[] nums,int start, int end){
        int sum=0;
        for(int i=start;i<end;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}