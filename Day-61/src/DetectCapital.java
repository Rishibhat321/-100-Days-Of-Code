public class DetectCapital {

    public static boolean detectCapitalUse(String word) {

        char c1 = ' ';
        char c2 = ' ';

        int count1 = 0;
        int count2 = 0;

        boolean flag = false;

        for(int i=0;i<word.length();i++)
        {
            c1 = Character.toUpperCase(word.charAt(i));
            c2 = Character.toLowerCase(word.charAt(i));

            if(word.charAt(i)==c1)
            {
                count1++;
            }

            if(word.charAt(i)==c2)
            {
                count2++;
            }
        }

        if(count1==word.length() || count2 == word.length())
        {
            return true;
        }

        for(int i=0;i<word.length();i++)
        {
            c1 = Character.toUpperCase(word.charAt(i));
            c2 = Character.toLowerCase(word.charAt(i));

            if(i==0 && word.charAt(i) == c1)
            {
                flag = true;
            }

            else if((i!=0 && flag==true) && word.charAt(i)==c1)
            {
                return false;
            }

            else if((i!=0 && flag==false) && word.charAt(i)==c1)
            {
                return false;
            }

            else{
                continue;
            }
        }

        return true;

    }
    public static void main(String[] args) {

        String word = "FlaG";

        boolean res = detectCapitalUse(word);

        System.out.println(res);

    }
}
