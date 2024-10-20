class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder result= new StringBuilder();
        char reminder='0';
        while (i>=0 || j>=0){
            char ad=i>=0?a.charAt(i):'0';
            char bd=j>=0?b.charAt(j):'0';
            String r=add(ad,bd,reminder);
            if(r.length()==2){
                reminder=r.charAt(0);
                r= String.valueOf(r.charAt(1));
            }else {
                reminder='0';
            }
            result.insert(0, r);
            i--;
            j--;
        }
        return reminder=='0'?result.toString():result.insert(0, '1').toString();
    }

    private String add(char ad, char bd,char re) {
        if(ad=='1' && bd=='1'){
            return re!='0'?"1"+add('0',re,'0'):"10";
        }else if(ad=='1' || bd=='1'){
            return re!='0'?add('1',re,'0'):"1";
        }else {
            return re!='0'?add('0',re,'0'):"0";
        }
    }

}