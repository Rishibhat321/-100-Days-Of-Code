
public class ReplaceAllDigitsWithCharacter {
    public static String replaceDigits(String s) {

        char ch = ' ';
        int n = 0;

        char[] arr = new char[s.length()];

        for(int i=0;i<s.length();i++)
        {
            arr[i] = s.charAt(i);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0){
                ch = arr[i-1];
                n = Character.getNumericValue(arr[i]);

                ch += n;

                arr[i] = ch;
            }
        }

        String str = new String(arr);

        return str;

    }

    public static void main(String[] args) {

        String s = "a1c1e1";

        String res = replaceDigits(s);

        System.out.println(res);

    }
}