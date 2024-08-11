import java.util.*;
import java.util.HashMap;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }

        int len = s.length();
        int res = -1;
        char ch = ' ';
        int j=0;
        int c = 0;

        char[] arr = new char[len];

        while(!map.isEmpty()){

            for(Map.Entry<Character, Integer> e : map.entrySet()){
                Character key = e.getKey();
                Integer val = e.getValue();

                if(res<val){
                    res = val;
                    ch = key;
                }
            }

            while(c<res){
                arr[j] = ch;
                j++;
                c++;
            }

            res = -1;
            c = 0;

            map.remove(ch);
        }

        String str = new String(arr);

        return str;
    }

    public static void main(String[] args) {

        String s =  "tree";

        String res = frequencySort(s);

        System.out.println(res);

    }
}