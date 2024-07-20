import java.util.Stack;

public class ValidParentheses {
    public static boolean outer(char ch)
    {
        if(ch == '[' || ch == '{' || ch == '(')
        {
            return true;
        }

        return false;
    }
    public static boolean isValid(String s) {

        if(s.equals(""))
        {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty())
            {
                stack.push(s.charAt(i));
            }

            else if(outer(s.charAt(i)))
            {
                stack.push(s.charAt(i));
            }

            else if(stack.peek() == '[' && s.charAt(i) == ']')
            {
                stack.pop();
            }

            else if(stack.peek() == '{' && s.charAt(i) == '}')
            {
                stack.pop();
            }

            else if(stack.peek() == '(' && s.charAt(i) == ')')
            {
                stack.pop();
            }

            else{
                stack.push(s.charAt(i));
            }
        }

        return (stack.isEmpty());

    }
    public static void main(String[] args) {

        String s = "{([])}";

        boolean res = isValid(s);

        System.out.println(res);
    }
}