class Solution {
    public int[] plusOne(int[] digits) {
        int add=1;
        for(int i=digits.length-1;i>=0;i--){
            int result=digits[i]+add;
            if(result>9){
                int zeroth=result%10;
                int tenth=result/10;
                digits[i]=zeroth;
                add=tenth;
            }else {
                digits[i]=result;
                add=0;
            }
        }
        if(add!=0){
           int[] result =new int[digits.length+1];
           result[0]=add;
            System.arraycopy(digits, 0, result, 1, digits.length + 1 - 1);
           return result;
        }
        return digits;
    }
}