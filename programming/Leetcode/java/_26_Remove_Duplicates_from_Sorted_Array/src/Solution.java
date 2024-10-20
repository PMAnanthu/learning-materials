class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int xLength=nums.length;
        while (left<xLength){
            int right=left+1;
            while (right<xLength){
                if(nums[left]==nums[right]){
                    int i=0;
                    for(i=right;i<xLength-1;i++){
                        nums[i]=nums[i+1];
                    }
                    xLength--;
                    right--;
                    nums[i]=0;
                }
                right++;
            }
            left++;
        }
        return xLength;
    }
}