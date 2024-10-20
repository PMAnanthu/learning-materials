class Solution2 {
    public int removeDuplicates(int[] nums) {
       // int[] nums={0,0,1,1,1,1,2,3,3};
        int[] res=new int[nums.length];
        int ress=0;
        int m=0;int n=0;
        int result=nums.length;

        for (int i = 0; i < nums.length && n<nums.length; i++) {
            if(nums[m]==nums[n]){
                if(n-m < 2){
                    res[ress]=nums[i];
                    ress++;
                    result--;
                }

            }else {
                res[ress]=nums[i];
                ress++;
                m=n;
            }
            n++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=res[i];
        }
        System.out.println("---"+result);
        return result;
    }
}