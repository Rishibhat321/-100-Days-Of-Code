public class ReverseStringII {
    public static void reverse(char[] arr, int low, int high)
    {
        while(low<high)
        {
            char ch = arr[low];
            arr[low] = arr[high];
            arr[high] = ch;

            low++;
            high--;
        }

    }

    public static String reverseStr(String s, int k) {

        int len = s.length();

        char[] arr = new char[len];

        for(int i=0;i<len;i++)
        {
            arr[i] = s.charAt(i);
        }

        int start = 0;
        int end = len-1;

        if(len<k)
        {
            reverse(arr, start, end);

            String str = new String(arr);

            return str;
        }

        int i=0;
        for(i=0;i+k<=len;i=i+(2*k))
        {
            reverse(arr, i, i+k-1);
        }

        reverse(arr, i, len-1);

        String str = new String(arr);

        return str;

    }
    public static void main(String[] args) {

        String s =  "abcdefg";
        int k =2;

        String res = reverseStr(s, k );

        System.out.println(res);

    }
}
