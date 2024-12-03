package example;

import java.util.Arrays;

class Solution1 implements Solution{
    public void moveZeroes(int[] nums) {
        int p2=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                nums[p2]=nums[i];
                p2++;
            }
        }
        Arrays.fill(nums,p2,nums.length,0);
    }
}