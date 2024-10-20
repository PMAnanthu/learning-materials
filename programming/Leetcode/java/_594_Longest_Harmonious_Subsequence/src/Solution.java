class Solution {
    public int findLHS(int[] nums) {
        int result=0,left=0,right=nums.length-1;
        while (left<nums.length){
            int max=findMax(nums,left,right);
            int min=findMin(nums,left,right);
            if(max-min==1 ){
                return right-left;
            }
            if(left<right){
                right--;
            }else {
                right=nums.length-1;
                left++;
            }
        }
        return result;
    }

    private int findMin(int[] nums, int left, int right) {
        int min=nums[0];
        for(int i=left;i<right;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }

    private int findMax(int[] nums, int left, int right) {
        int max=nums[0];
        for(int i=left;i<right;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
}