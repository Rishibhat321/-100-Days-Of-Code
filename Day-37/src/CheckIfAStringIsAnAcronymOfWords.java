import java.util.*;

public class CheckIfAStringIsAnAcronymOfWords {

    public static boolean isAcronym(List<String> words, String s) {

        int len = words.size();

        if(len==0 && !s.equals("")){
            return false;
        }

        if(len!=s.length()){
            return false;
        }

        char[] ch = new char[len];

        int i=0;

        for(String str : words)
        {
            ch[i] = str.charAt(0);
            i++;
        }

        for(int j=0;j<s.length();j++)
        {
            if(ch[j]!=s.charAt(j)){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");

        String s = "abc";

        boolean res = isAcronym(words, s);

        System.out.println(res);

    }
}