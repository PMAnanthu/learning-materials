class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=s.length();
        String result="";
        while (start<end){
            if(isPalindrome(s.substring(start,end))){
                if(result.length()<s.substring(start,end).length()){
                    result=s.substring(start,end);
                }
            }
            end--;
            if(end==start) {
                end = s.length();
                start++;
            }
            if(result.length()>(s.length()-start)){
                break;
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt((s.length()-1)-i)){
                return false;
            }
        }
        return true;
    }
}