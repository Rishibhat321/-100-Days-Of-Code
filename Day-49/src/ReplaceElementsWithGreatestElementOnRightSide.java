
public class ReplaceElementsWithGreatestElementOnRightSide {

    public static int[] replaceElements(int[] arr) {

        int[] res = new int[arr.length];

        if(arr.length==1){
            res[0] = -1;

            return res;
        }

        int max = arr[arr.length-1];
        int prev = Integer.MIN_VALUE;

        for(int i=arr.length-2;i>=0;i--)
        {
            max = Math.max(max,prev);
            prev = arr[i];

            res[i] = max;
        }

        res[arr.length-1] = -1;

        return res;

    }
    public static void main(String[] args) {

        int[] arr = {17,18,5,4,6,1};

        int[] array = replaceElements(arr);

        for(int ele:array){
            System.out.print(ele + " ");
        }

    }
}