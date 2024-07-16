import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
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

        String s = new String("abbaca");
        String st = removeDuplicates(s);

        System.out.println(st);


    }
}