import java.util.*;
public class RemoveStarsFromAString {
    public static String removeStars(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= '*'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='*' && !stack.isEmpty()){
                stack.pop();
            }
            else{
                continue;
            }
        }

        if(stack.isEmpty()){
            String st = new String("");

            return st;
        }

        int len = stack.size();
        char[] arr = new char[len];

        for(int i=len-1;i>=0;i--){
            arr[i] = stack.pop();
        }

        String str = new String(arr);

        return str;
    }
    public static void main(String[] args) {

        String s = new String("leet**cod*e");

        String st = removeStars(s);

        System.out.println(st);

    }
}
