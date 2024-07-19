
import java.util.Stack;

public class ReverseWordsInAString_usingStack {
    public static void reverse(char[] arr, int low, int high){

        while(low<high){
            char ch = arr[low];
            arr[low] = arr[high];
            arr[high] = ch;

            low++;
            high--;
        }
    }
    public static String reverseWords(String s) {

        if(s.equals(""))
        {
            return "";
        }

        Stack<Character> stack = new Stack<Character>();
        int n = s.length();

        for(int i=0;i<n;i++)
        {
            if((i<n-1) && (s.charAt(i)!=' ' && s.charAt(i+1)==' '))
            {
                stack.push(s.charAt(i));
                stack.push(s.charAt(i+1));
            }

            else if(s.charAt(i)!=' ')
            {
                stack.push(s.charAt(i));
            }

            else{
                continue;
            }
        }

        if(stack.isEmpty())
        {
            return "";
        }

        if(stack.peek()==' ')
        {
            stack.pop();
        }

        int len = stack.size();

        char[] arr = new char[len];

        int j=len-1;
        int start=0;
        int end=0;

        while(!stack.isEmpty())
        {
            arr[j] = stack.pop();
            j--;
        }

        for(end=0;end<arr.length;end++)
        {
            if(arr[end]==' '){
                reverse(arr,start,end-1);
                start = end+1;
            }
        }

        reverse(arr,start,len-1);
        reverse(arr,0,len-1);

        String str = new String(arr);

        return str;

    }
    public static void main(String[] args) {
        String s = new String("  hello world  ");

        String res = reverseWords(s);

        System.out.println(res);

    }
}