import java.util.HashSet;

public class GreatestEnglishLetterInUpperAndLowerCase {

    public static String greatestLetter(String s) {

        HashSet<Character> set = new HashSet<Character>();

        char ch = ' ';
        char res = ' ';
        char max = ' ';

        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                ch = Character.toUpperCase(s.charAt(i));
                if(set.contains(ch)){
                    res = ch;
                }
            }

            if(Character.isUpperCase(s.charAt(i)))
            {
                ch = Character.toLowerCase(s.charAt(i));
                if(set.contains(ch)){
                    res = s.charAt(i);
                }
            }

            if(max<res)
            {
                max = res;
            }

            set.add(s.charAt(i));
        }

        if(max==' ')
        {
            return new String("");
        }

        String str = Character.toString(max);

        return str;
    }

    public static void main(String[] args) {

        String s =  "lEeTcOdE";

        String res = greatestLetter(s);

        System.out.println(res);

    }
}