
import java.util.HashSet;

public class FindMaximumNumberOfStringPairs_usingHashSet {

    public static int maximumNumberOfStringPairs(String[] words) {

        // using HashSet

        HashSet<String> set = new HashSet<String>();
        int pair = 0;

        for(int i=0;i<words.length;i++)
        {

            String str = new StringBuilder(words[i]).reverse().toString();

            if(set.contains(str)){
                pair++;
            }

            set.add(words[i]);
        }

        return pair;

    }

    public static void main(String[] args) {

        String[] words = {"cd","ac","dc","ca","zz"};

        int res = maximumNumberOfStringPairs(words);

        System.out.println(res);

    }
}
