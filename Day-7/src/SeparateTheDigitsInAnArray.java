import java.util.*;
public class SeparateTheDigitsInAnArray {
    public static int[] separateDigits(int[] nums) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int n=0;
        int a=0;
        int i=0;
        int s=0;

        for(int j=0;j<nums.length;j++)
        {
            n = nums[j];
            while(n>0){
                a = n%10;
                n /= 10;
                list.add(a);
            }
            s = list.size();

            Collections.reverse(list.subList(i, s));
            i=s;

        }

        int len = list.size();

        int[] arr = new int[len];
        int k=0;

        for(int ele:list){
            arr[k] = ele;
            k++;
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] nums = {13,25,83,77};

        int[] res = separateDigits(nums);

        for(int ele:res){
            System.out.print(ele + " ");
        }
    }
}