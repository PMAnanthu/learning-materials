class Solution {
    public double findMaxAverage(int[] nums, int k) {
        Double result=null;
        for(int i=0;i<nums.length-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            double temp = (double) sum / k;
            if(result==null || result<temp){
                result=temp;
            }
        }
        return result.doubleValue();
    }
}