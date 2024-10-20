class Solution1 {
    public int removeDuplicates(int[] nums) {
        int[] res = new int[nums.length];
        int ress = 0;
        int m = 0;
        int n = 1;
        int result = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if(n<nums.length) {
                if (nums[m] == nums[n]) {
                    n++;
                    result--;
                } else {
                    res[ress] = nums[i];
                    ress++;
                    m = i;
                    n = i + 1;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
        return result;
    }
}