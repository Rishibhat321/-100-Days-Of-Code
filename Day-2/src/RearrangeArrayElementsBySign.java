import java.util.Stack;

public class RearrangeArrayElementsBySign {
    public static int[] rearrangeArray(int[] nums) {

        int len = nums.length;
        int[] arr = new int[len];
        int j=0;
        int k=1;

        Stack<Integer> stack = new Stack<Integer>();

        for(int i=len-1;i>=0;i--)
        {
            if(nums[i]<0){
                stack.push(nums[i]);
            }
        }

        for(int i=0;i<len;i++)
        {
            if(nums[i]>=0){
                arr[j] = nums[i];
                j += 2;
            }
        }

        while(!stack.isEmpty())
        {
            arr[k] = stack.pop();
            k += 2;
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] nums = {3,1,-2,-5,2,-4};

        int[] res = rearrangeArray(nums);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}