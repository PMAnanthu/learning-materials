package org.test;

import java.util.*;


class Pair<T,E>{
    T num1;
    E num2;

    public Pair(T i, E j) {
        num1=i;
        num2=j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(num1, pair.num1) && Objects.equals(num2, pair.num2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2);
    }
}
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int m=nums2.length;

        List<List<Integer>> result=new ArrayList<>();
        Queue<int[]> queue=new PriorityQueue<>((a, b)->a[0]-b[0]);
        queue.offer(new int[]{nums1[0]+nums2[0],0,0});
        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        visited.add(new Pair<>(0,0));
        while (k-->0 && !queue.isEmpty()){
            int[] values = queue.poll();
            int i=values[1];
            int j=values[2];

            result.add(List.of(nums1[i], nums2[j]));

            if(i+1<n && !visited.contains(new Pair<>(i+1,j))){
                queue.offer(new int[]{nums1[i + 1] + nums2[j], i + 1, j});
                visited.add(new Pair<>(i + 1, j));
            }
            if(j+1<m && !visited.contains(new Pair<>(i,j+1))){
                queue.offer(new int[]{nums1[i] + nums2[j+1], i, j+1});
                visited.add(new Pair<>(i, j+1));
            }
        }
        return result;
    }
}