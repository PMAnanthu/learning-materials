class Solution {
    public int lengthOfLastWord(String s) {
        int length=s.length()-1;
        int end=length;
        int start=length;
        while (length>=0){
            if(s.charAt(length)==' '){
                if(start!=end){
                    return end-start;
                }
                end--;
                start=end;
            }else {
                start--;
            }
            length--;
        }
        return end-start;
    }
}