
import java.util.*;
import java.util.HashMap;

public class MakeTwoArraysEqualByReversingSubArrays {

    public static boolean canBeEqual(int[] target, int[] arr) {

        if(target.length>arr.length || target.length<arr.length)
        {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for(int i=0;i<target.length;i++)
        {
            if(!map.containsKey(target[i]))
            {
                map.put(target[i],1);
            }
            else{
                map.put(target[i], map.get(target[i])+1);
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(!map2.containsKey(arr[i]))
            {
                map2.put(arr[i],1);
            }
            else{
                map2.put(arr[i], map2.get(arr[i])+1);
            }
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet())
        {
            Integer key = e.getKey();
            Integer value = e.getValue();

            if(!map2.containsKey(key)){
                return false;
            }

            if(map2.get(key)!=value){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] target = {3,7,9};
        int[] arr = {3,7,11};

        boolean res = canBeEqual(target, arr);

        System.out.println(res);

    }
}