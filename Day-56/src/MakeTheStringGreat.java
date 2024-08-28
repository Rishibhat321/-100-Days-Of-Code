import java.util.Stack;
public class MakeTheStringGreat {

    public static String makeGood(String s) {

        char ch1 = ' ';
        char ch2 = ' ';

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            ch1 = Character.toLowerCase(s.charAt(i));
            ch2 = Character.toUpperCase(s.charAt(i));

            if(stack.isEmpty())
            {
                stack.push(s.charAt(i));
            }

            else if((stack.peek()==ch1 && s.charAt(i)==ch2) || (stack.peek()==ch2 && s.charAt(i)==ch1))
            {
                stack.pop();
            }

            else{
                stack.push(s.charAt(i));
            }
        }

        int len = stack.size();
        char[] arr = new char[len];

        int j = len-1;

        while(!stack.isEmpty())
        {
            arr[j] = stack.pop();
            j--;
        }

        String str = new String(arr);

        return str;

    }
    public static void main(String[] args) {

        String s = "leEeetcode";

        String res = makeGood(s);

        System.out.println(res);
    }
}
