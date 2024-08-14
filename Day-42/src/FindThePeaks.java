import java.util.*;

public class FindThePeaks {
    public static List<Integer> findPeaks(int[] mountain) {

        List<Integer> list = new ArrayList<Integer>();

        for(int i=1;i<mountain.length-1;i++)
        {
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                list.add(i);
            }
        }

        return list;

    }

    public static void main(String[] args) {

        int[] nums = {1,4,3,8,5};

        List<Integer> res =   findPeaks(nums);

        System.out.println(res);

    }
}