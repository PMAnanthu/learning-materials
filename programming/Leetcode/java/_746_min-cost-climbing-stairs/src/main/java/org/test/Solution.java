package org.test;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] d=new int[cost.length];
        for(int i=cost.length-2;i>=0;i--){
            d[i]=cost[i]+Math.max(cost[i+1],cost[i+2]);
        }
        return Math.min(d[0],d[1]);
    }
}