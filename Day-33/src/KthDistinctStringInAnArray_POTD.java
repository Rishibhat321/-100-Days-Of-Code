import java.util.HashSet;

public class KthDistinctStringInAnArray_POTD {

    public static String kthDistinct(String[] arr, int k) {

        HashSet<String> set = new HashSet<String>();
        HashSet<String> set2 = new HashSet<String>();
        int c=0;

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                set2.add(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(!set2.contains(arr[i])){
                c++;

                if(c==k){
                    return arr[i];
                }
                else{
                    continue;
                }
            }
        }

        String str = new String("");

        return str;
    }
    public static void main(String[] args) {

        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;

        String res = kthDistinct(arr, k);

        System.out.println(res);

    }
}