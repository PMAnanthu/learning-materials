class Solution {
    public String intToRoman(int num) {
        int[] sortedValue={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] value={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result=new StringBuilder();
        for(int i=0;i<sortedValue.length;i++){
           int occur= num/sortedValue[i];
           if(occur!=0){
               result.append(value[i].repeat(Math.max(0, occur)));
               num=num-(occur*sortedValue[i]);
           }
        }
        return result.toString();
    }
}