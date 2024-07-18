import java.util.HashMap;
public class ValidAnagram_HashMap {
    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int val=0;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }

        for(int i=0;i<t.length();i++)
        {
            char temp = t.charAt(i);

            if(!map.containsKey(temp))
            {
                return false;
            }

            if(map.containsKey(temp))
            {

                map.put(temp, map.get(temp)-1);
                val = map.get(temp);

            }

            if(val==0)
            {
                map.remove(temp);
            }
        }

        return (map.size()==0);

    }
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean res = isAnagram(s, t);

        System.out.println(res);

    }
}
