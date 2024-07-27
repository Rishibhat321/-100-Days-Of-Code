class Solution{

    public String mergeAlternately(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();
        int len = len1 + len2;

        char[] arr = new char[len];

        int i=0;
        int j=0;
        int k=0;

        while(i<len1 && j<len2)
        {
            arr[k] = word1.charAt(i);
            i++;
            k++;
            arr[k] = word2.charAt(j);
            j++;
            k++;
        }

        while(i<len1){
            arr[k] = word1.charAt(i);
            i++;
            k++;
        }

        while(j<len2){
            arr[k] = word2.charAt(j);
            j++;
            k++;
        }

        String str = new String(arr);

        return str;

    }

}
public class MergeStringsAlternately {

    public static void main(String[] args) {

        String word1 = "abcd";
        String word2 = "pq";

        Solution obj = new Solution();

        String res = obj.mergeAlternately(word1, word2);

        System.out.println(res);

    }
}
