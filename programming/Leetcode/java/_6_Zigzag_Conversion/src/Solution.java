class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        int magicValue=numRows+(numRows-2);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j=j+magicValue){
                result.append(s.charAt(j));
                if(i>0 && i<numRows-1 && j+(magicValue-2 * i)<s.length()){
                    result.append(s.charAt(j+magicValue-2 * i));
                }
            }
        }
        return result.toString();
    }
}