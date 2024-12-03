package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int[] result = new int[mat.length * mat[0].length];
        int n = mat.length;
        int m = mat[0].length;
        int k=0;

        List<Integer> array=new ArrayList<>();

        for (int d = 0; d < n + m - 1; d++) {
            int r = d < m ? 0 : d - m + 1;
            int c = d < m ? d : m - 1;

            array.clear();
            while (r<n && c>=0){
                array.add(mat[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                Collections.reverse(array);
            }

            for(Integer integer:array){
                result[k++]=integer;
            }
        }

        return result;
    }
}