package org.example;

class Solution2 implements Solution{
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0 ) return "";
        int min=Integer.MAX_VALUE;
        for(String s:strs){
            min=Math.min(min,s.length());
        }
        int low =1;
        int high=min;
        while (low<high){
            int mid=(low+high)/2;
            if(isCommon(strs,mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return strs[0].substring(0,(low + high) / 2);
    }
    private boolean isCommon(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) if (
                !strs[i].startsWith(str1)
        ) return false;
        return true;
    }
}