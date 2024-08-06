import java.util.*;
public class CanMakeArithmeticProgressionFormSequence {

    public static boolean canMakeArithmeticProgression(int[] arr) {

        if(arr.length==2){
            return true;
        }

        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        int d = 0;

        for(int i=2;i<arr.length;i++)
        {
            d = arr[i] - arr[i-1];

            if(d!=diff){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,4};

        boolean res = canMakeArithmeticProgression(arr);

        System.out.println(res);

    }
}
