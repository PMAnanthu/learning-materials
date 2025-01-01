package org.test;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[][] metrix={{1,2,3},{4,5,6},{7,8,9}};
        solution.spiralOrder(metrix).forEach(System.out::println);
    }
}