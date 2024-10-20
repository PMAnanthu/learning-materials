class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0 || nums.length==0){
            return false;
        }
        int left=0,right=1;
        boolean flag=false;
        while (left<nums.length && right<nums.length){
            if(nums[left]==nums[right]){
                return true;
            }
            if (Math.abs(right-left)<k && right<nums.length-1){
                right++;
            }else {
                left++;
                right=left+1;
            }

        }
        return  flag;
    }
}