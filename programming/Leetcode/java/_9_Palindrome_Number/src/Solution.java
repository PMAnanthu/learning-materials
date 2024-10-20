class Solution {
    public int reverse(int x) {
       int min=Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;
        int num=0;
        while(x!=0){
            int value = x%10;
            if(num > max/10 || (num==max/10 && value >7) || num <min/10 || (num==min/10 && value < -8)){
                return 0;
            }
           
            num = (num * 10 )+value;
             x = x / 10;
        }

        return num;
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        return x == reverse(x);
    }
}