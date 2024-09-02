import java.util.HashSet;

public class CountTheNumberOfSpecialCharactersI {

    public static int numberOfSpecialChars(String word) {

        char c1 = ' ';
        char c2 = ' ';

        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        int i=0;

        while(i<word.length())
        {
            c1 = Character.toUpperCase(word.charAt(i));
            c2 = Character.toLowerCase(word.charAt(i));

            if(set.contains(word.charAt(i)))
            {
                i++;
                continue;
            }

            else if(word.charAt(i)==c1)
            {
                if(set.contains(c2))
                {
                    count++;
                }

                set.add(word.charAt(i));
                i++;
            }

            else if(word.charAt(i)==c2)
            {
                if(set.contains(c1))
                {
                    count++;
                }

                set.add(word.charAt(i));
                i++;
            }

            else{
                set.add(word.charAt(i));
                i++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        String s = "aaAbcBC";

        int res = numberOfSpecialChars(s);

        System.out.println(res);


    }
}