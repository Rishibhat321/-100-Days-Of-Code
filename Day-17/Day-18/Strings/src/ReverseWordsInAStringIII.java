public class ReverseWordsInAStringIII {

    public static void reverse(char[] temp, int low, int high)
    {
        while(low<high)
        {
            char ch = temp[low];
            temp[low] = temp[high];
            temp[high] = ch;

            low++;
            high--;
        }
    }
    public static String reverseWords(String s) {

        int start = 0;
        int end=0;

        int len = s.length();

        char[] temp = new char[len];

        for(int i=0;i<len;i++)
        {
            temp[i] = s.charAt(i);
        }

        for(end=0;end<len;end++)
        {
            if(temp[end]==' ')
            {
                reverse(temp, start, end-1);
                start = end+1;
            }
        }

        reverse(temp, start, len-1);


        String str = new String(temp);

        return str;
    }
    public static void main(String[] args) {

        String s  = s = "Let's take LeetCode contest";

        String res = reverseWords(s);

        System.out.println(res);

    }
}
