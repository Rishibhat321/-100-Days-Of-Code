import java.util.Stack;

public class ClearDigits {

    public static boolean isDigit(char ch){

        if(ch>='0' && ch<='9'){
            return true;
        }

        return false;
    }

    public static String clearDigits(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }

            else if(isDigit(s.charAt(i))){
                stack.pop();
            }

            else{
                stack.push(s.charAt(i));
            }
        }

        if(stack.isEmpty()){
            return new String("");
        }

        char[] arr = new char[stack.size()];

        int j=stack.size()-1;

        while(!stack.isEmpty())
        {
            arr[j] = stack.pop();
            j--;
        }

        String str = new String(arr);

        return str;

    }

    public static void main(String[] args) {

        String s = "cb34";

        String res = clearDigits(s);

        System.out.println(res);

    }
}