public class FindTheDifference {

    public static char findTheDifference(String s, String t) {

        int ind = -1;

        int[] arr = new int[256];

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]--;
            arr[t.charAt(i)]++;
        }

        arr[t.charAt(t.length()-1)]++;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1){
                ind = i;
                break;
            }
        }

        char ch = (char) ind;

        return ch;

    }
    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        char res = findTheDifference(s ,t);

        System.out.println(res);

    }
}
