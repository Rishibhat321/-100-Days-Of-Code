import java.util.HashMap;
import java.util.*;

public class SortThePeople_usingHashMap {
    public static String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        for(int i=0;i<heights.length;i++)
        {
            map.put(heights[i],names[i]);
        }

        Arrays.sort(heights);
        int j=0;

        for(int i=heights.length-1;i>=0;i--)
        {
            names[j] = map.get(heights[i]);
            j++;
        }

        return names;
    }
    public static void main(String[] args) {

        String[] names = {"Mary","John","Emma"};
        int[] heights = {180, 165, 170};

        String[] res = sortPeople(names, heights);

        for(String element: res){
            System.out.print(element + " ");
        }


    }
}
