class Solution1 {
    public int removeDuplicates(int[] nums) {
       int xLength=0;
       int m=0,n=0;
       int result[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
           if(nums[m]==nums[n]){
                if((n-m)<2){
                    result[xLength]=nums[n];
                    xLength++;
                }
           }else{
               result[xLength]=nums[n];
               xLength++;
               m=n;
           }
           n++;
       }
       for(int i=0;i<nums.length;i++){
           if(i<xLength) {
               nums[i] = result[i];
           }else {
               nums[i]=0;
           }
       }
       return xLength;
    }
}