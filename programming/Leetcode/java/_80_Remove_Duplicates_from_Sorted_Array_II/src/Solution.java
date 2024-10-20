class Solution {
    public int removeDuplicates(int[] nums) {
        int xLength=nums.length;
        int i=0;
        int allowed=2;
        while(i<xLength){
            int allow=1;
            for(int j=i+1;j<xLength;j++){
                if(nums[i]==nums[j]){
                    if(allow==allowed) {
                        int k = 0;
                        for (k = j; k < xLength - 1; k++) {
                            nums[k] = nums[k + 1];
                        }
                        xLength--;
                        j--;
                        nums[k] = 0;
                    }else {
                        allow++;
                    }
                }else{
                    break;
                }
            }
            i++;
        }
        return xLength;
    }
}