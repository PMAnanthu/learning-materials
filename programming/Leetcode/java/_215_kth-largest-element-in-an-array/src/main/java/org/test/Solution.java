package org.test;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue=new PriorityQueue<>(k);
        for(int i:nums){
            queue.offer(i);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.poll();
    }
}