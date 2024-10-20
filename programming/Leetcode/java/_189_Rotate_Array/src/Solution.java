class Solution {
    public void rotate(int[] nums, int k) {
        int pointer=k%nums.length;
        if(nums.length==1 || pointer<=0){
            return;
        }
        rotateArray(nums,0,nums.length-1);
        rotateArray(nums,0,pointer-1);
        rotateArray(nums,pointer,nums.length-1);
    }
    private void rotateArray(int[] nums,int m, int n){
        int start=m;
        int end=n;
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}