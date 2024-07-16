public class Lexicographically_Smallest_String_after_a_Swap {

    public static boolean evenCharacter(char ch)
    {
        if(ch=='0' || ch=='2'||ch=='4' || ch=='6'|| ch == '8')
        {
            return true;
        }

        return false;
    }

    public static boolean oddCharacter(char ch)
    {
        if(ch=='1' || ch=='3' || ch=='5' || ch=='7' || ch=='9')
        {
            return true;
        }

        return false;
    }

    public static String getSmallestString(String s) {

        int len = s.length();

        char[] arr = new char[len];

        for(int i=0;i<s.length();i++)
        {
            arr[i] = s.charAt(i);
        }

        for(int i=0;i<len-1;i++)
        {
            if(evenCharacter(arr[i]) && evenCharacter(arr[i+1]))
            {
                if(arr[i]>arr[i+1])
                {
                    char temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    break;
                }
            }

            if(oddCharacter(arr[i]) && oddCharacter(arr[i+1]))
            {
                if(arr[i]>arr[i+1])
                {
                    char temp1 = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp1;

                    break;
                }
            }
        }


        String str = new String(arr);

        return str;
    }
    public static void main(String[] args) {

        String s = new String("45320");

        String res = getSmallestString(s);

        System.out.println(res);
    }
}
