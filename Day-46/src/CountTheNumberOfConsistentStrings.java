/* import java.util.HashSet; */

public class CountTheNumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {

    /*    HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        int j=0;
        int c=0;
        String str = "";

        for(int i=0;i<allowed.length();i++)
        {
            set.add(allowed.charAt(i));
        }

        for(int i=0;i<words.length;i++)
        {
            c=0;
            str = words[i];
            for(j=0;j<str.length();j++)
            {
                if(!set.contains(str.charAt(j))){
                    break;
                }
                else{
                    c++;
                }
            }

            if(c==str.length()){
                count++;
            }
        }

        return count;   */


        int[] arr = new int[256];

        for(int i=0;i<allowed.length();i++)
        {
            arr[allowed.charAt(i)]++;
        }

        String str = "";
        int c = 0;
        int count = 0;

        for(int i=0;i<words.length;i++)
        {
            str = words[i];
            c=0;

            for(int j=0;j<str.length();j++)
            {
                if(arr[str.charAt(j)]==0){
                    break;
                }
                else{
                    c++;
                }
            }

            if(c==str.length()){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        String[] words = {"ad","bd","aaab","baa","badab"};
        String allowed = "ab";

        int res = countConsistentStrings(allowed,words);

        System.out.println(res);
    }
}
