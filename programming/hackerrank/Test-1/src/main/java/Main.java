import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    //input : “abcabcbb”
    //output 3
    public static void main(String[] s){
     //   System.out.println(findLongSubStringLength("pwwkew"));

        RequestBuilder  builder=new RequestBuilder();
        Request request = builder.withName("sample").withData("test").build();
        System.out.println(request);
    }

    public static int findLongSubStringLength(String input){
        int result=0;
        int left=0;
        int right=1;
        while(right<input.length() && left<input.length()){
            String subString=input.substring(left,right);
            if(!isRepetedChar(subString)){
                right++;
                if(result<subString.length()){
                    result=subString.length();
                }
            }else{
                left++;
            }
        }
        return result;
    }

    public static boolean isRepetedChar(String input){
        Set<String> data=new HashSet<>();
        for(int i=0;i<input.length();i++){
            char charAt = input.charAt(i);
            if(data.contains(String.valueOf(charAt))){
                return true;
            }else{
                data.add(String.valueOf(charAt));
            }
        }
        return false;
    }
}
