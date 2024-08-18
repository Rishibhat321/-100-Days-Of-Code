public class ReversePrefixOfWord {

    public static void reverse(char[] arr, int low, int high){
        while(low<high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
    public static String reversePrefix(String word, char ch) {

        char[] arr = new char[word.length()];
        int ind = 0;

        for(int i=0;i<word.length();i++)
        {
            arr[i] = word.charAt(i);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ch){
                ind = i;
                break;
            }
        }

        reverse(arr,0,ind);

        String str = new String(arr);

        return str;
    }

    public static void main(String[] args) {

        String word = "abcdefd";
        char ch = 'd';

        String res = reversePrefix(word, ch);

        System.out.println(res);

    }
}
