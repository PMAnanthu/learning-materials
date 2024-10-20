import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbs, int target) {
        int[] result= new int[2];
        Map<Integer,Integer> reference=new HashMap<>();
        for(int i=0;i<numbs.length;i++){
            int diff=target-numbs[i];
            if(reference.containsKey(diff)){
                int start=reference.get(diff);
                result[0]=start;
                result[1]=i;
                return result;
            }else {
                reference.put(numbs[i],i);
            }
        }
        return result;
    }
}