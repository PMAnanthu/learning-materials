package org.test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        Arrays.stream(solution.findDiagonalOrder(mat)).forEach(System.out::println);
    }
}