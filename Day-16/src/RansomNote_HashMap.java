
import java.util.HashMap;

public class RansomNote_HashMap {

    public static boolean canConstruct(String ransomNote, String magazine) {

        if(magazine.length()==0){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int val =0;

        for(int i=0;i<magazine.length();i++)
        {
            char ch = magazine.charAt(i);

            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }

        for(int i=0;i<ransomNote.length();i++)
        {
            char temp = ransomNote.charAt(i);

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

        return true;
    }
    public static void main(String[] args) {

        String ransomNote = "a";
        String magazine = "b";

        boolean res = canConstruct(ransomNote, magazine);

        System.out.println(res);

    }
}