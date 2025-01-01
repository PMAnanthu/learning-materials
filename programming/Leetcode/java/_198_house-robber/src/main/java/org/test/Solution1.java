package org.test;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution{
    int[] nums;
    Map<Integer,Integer> cache=new HashMap<>();
    public int rob(int[] nums){
        this.nums=nums;
        return dp(nums.length-1);
    }

    public int dp(int i){
        if(i==0) return nums[0];
        if(i==1) return Math.max(nums[0],nums[1]);
        if(!cache.containsKey(i)){
            cache.put(i,Math.max(dp(i-1),dp(i-2)+nums[i]));
        }
        return cache.get(i);
    }
}