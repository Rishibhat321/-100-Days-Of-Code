import java.util.HashSet;

public class FirstLetterToAppearTwice {
    public static char repeatedCharacter(String s) {

        HashSet<Character> set = new HashSet<Character>();

        for(int i=0;i<s.length();i++)
        {
            if(set.contains(s.charAt(i)))
            {
                return (s.charAt(i));
            }

            set.add(s.charAt(i));
        }

        return ' ';

    }
    public static void main(String[] args) {

        String s = "abccbaacz";

        char ch = repeatedCharacter(s);

        System.out.println(ch);
    }
}