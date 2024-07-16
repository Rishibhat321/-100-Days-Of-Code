import java.util.HashMap;
public class FindOccurrencesOfAnElementInAnArray {
    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        // using HashMap

        int len = queries.length;
        int[] arr = new int[len];
        int count=0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = -1;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
            {
                count++;

                map.put(count,i);

            }
        }


        for(int i=0;i<queries.length;i++)
        {
            if(map.containsKey(queries[i]))
            {
                arr[i] = map.get(queries[i]);
            }
        }

        return arr;

    }
    public static void main(String[] args) {

        int[] nums = {1,3,1,7};
        int[] queries = {1,3,2,4};
        int x=1;

        int[] res = occurrencesOfElement(nums, queries, x);

        for(int ele:res)
        {
            System.out.print(ele+ " ");
        }

    }
}
