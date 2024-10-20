import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        Character value;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if(stack.empty()) {
                        return false;
                    }
                    value = stack.pop();
                    if(value!='('){
                        return false;
                    }
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ']':
                    if(stack.empty()) {
                        return false;
                    }
                    value = stack.pop();
                    if(value!='['){
                        return false;
                    }
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '}':
                    if(stack.empty()) {
                        return false;
                    }
                    value = stack.pop();
                    if(value!='{'){
                        return false;
                    }
                    break;
                default:
                    stack.push('0');
                    break;
            }
        }
        return stack.empty();
    }
}