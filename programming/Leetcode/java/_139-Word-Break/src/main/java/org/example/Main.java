package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Solution solution=new Solution();
       List<String> wordDict = Arrays.asList("aaaa","aaa");
       System.out.println(solution.wordBreak("aaaaaaa",wordDict));
    }
}