class Solution1 {
    public int removeElement(int[] nums, int val) {
        int [] num=new int[nums.length];
        int result=nums.length;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=-1;
                result--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) {
                num[m]=nums[i];
                m++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=num[i];
        }
        return result;
    }
}