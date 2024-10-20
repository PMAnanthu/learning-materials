class Solution2 {
    public double findMaxAverage(int[] nums, int k) {
        Double result=null;
        double sum=0;
        int start=0;
        int end=0;
        for(end=0;end<nums.length;end++){
            sum+=nums[end];
            if(end>=k-1){
                double temp = sum / k;
                if(result==null || result<temp){
                    result=temp;
                }
                sum-=nums[start];
                start++;
            }
        }
        return result != null?result:0;
    }
}