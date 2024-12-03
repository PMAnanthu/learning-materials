package org.test;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] num1={1,2,4,5,6};
        int[] num2={3,5,7,9};
        int k=20;
        List<List<Integer>> result = solution.kSmallestPairs(num1, num2, k);
        result.forEach(System.out::println);

    }
}