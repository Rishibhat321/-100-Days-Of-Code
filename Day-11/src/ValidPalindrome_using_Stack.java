import java.util.Stack;
public class ValidPalindrome_using_Stack {
    public static boolean isPalindrome(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            char ch = Character.toLowerCase(s.charAt(i));

            if(ch>='a' && ch<='z')
            {
                stack.push(ch);
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                stack.push(s.charAt(i));
            }
            else{
                continue;
            }
        }

        int len = stack.size();
        int[] arr = new int[len];
        int j=len-1;

        while(!stack.isEmpty()){
            arr[j] = stack.pop();
            j--;
        }

        int low = 0;
        int high = arr.length-1;

        while(low<high)
        {
            if(arr[low]!=arr[high]){
                return false;
            }
            else{
                low++;
                high--;
            }
        }

        return true;

    }
    public static void main(String[] args) {

        String str = new String("A man, a plan, a canal: Panama");

        boolean res =  isPalindrome(str);

        if(res){
            System.out.println("Valid Palindrome");
        }
        else{
            System.out.println("Not Valid Palindrome");
        }
    }
}