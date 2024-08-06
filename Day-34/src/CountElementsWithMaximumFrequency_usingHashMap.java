import java.util.*;
import java.util.HashMap;

public class CountElementsWithMaximumFrequency_usingHashMap {

    public static int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        int maxValue = Collections.max(map.values());
        int freq = 0;

        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            Integer key = e.getKey();
            Integer val = e.getValue();

            if(val==maxValue){
                freq += val;
            }
        }

        return freq;

    }

    public static void main(String[] args) {

        int[] nums = {1,2,2,3,1,4};

        int res = maxFrequencyElements(nums);

        System.out.println(res);

    }
}