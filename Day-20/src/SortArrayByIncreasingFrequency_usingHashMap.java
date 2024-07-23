import java.util.*;
import java.util.HashMap;

public class SortArrayByIncreasingFrequency_usingHashMap {

    public static int[] frequencySort(int[] nums) {

        int[] arr = new int[nums.length];
        int j=0;
        int l=0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }


        int k = 0;
        int min = Integer.MAX_VALUE;

        while(!map.isEmpty())
        {
            l=0;
            min = Integer.MAX_VALUE;
            for(Map.Entry<Integer, Integer> e: map.entrySet())
            {
                Integer key = e.getKey();
                Integer val = e.getValue();

                if(min>val){
                    min = val;
                    k= key;
                }

                else if(min == val && key>k){
                    k = key;
                }
            }

            map.remove(k);

            while(l<min){
                arr[j] = k;
                j++;
                l++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,2,3};

        int[] res = frequencySort(nums);

        for(int ele:res){
            System.out.print(ele + " ");
        }


    }
}