class Solution {
    public int mySqrt(int x) {
        int i=1;
        int count=0;
        while (x>0){
            x=x-i;
            if(x>=0) {
                count++;
                i = i + 2;
            }
        }
        return count;
    }
}