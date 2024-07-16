
public class Find_first_palindromic_string_in_the_array {

    public static boolean isPalindrome(String str)
    {
        int low = 0;
        int high = str.length()-1;

        while(low<high)
        {
            if(str.charAt(low)!=str.charAt(high))
            {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }
    public static String firstPalindrome(String[] words) {

        for(int i=0;i<words.length;i++)
        {
            String str = words[i];

            if(isPalindrome(str))
            {
                return str;
            }
        }

        return "";

    }
    public static void main(String[] args) {

        String[] words = {"abc","car","ada","racecar","cool"};

        String res = firstPalindrome(words);

        System.out.println(res);

    }
}