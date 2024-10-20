class Solution {
    public int removeElement(int[] nums, int val) {
        int xLength=nums.length;
        for(int i=0;i<xLength;i++){
            if(nums[i]==val){
                for(int j=i;j<xLength-1;j++){
                    nums[j]=nums[j+1];
                }
                xLength--;
                i--;
            }
        }
        for(int i=xLength;i<nums.length;i++){
            nums[i]=0;
        }
        return xLength;
    }
}