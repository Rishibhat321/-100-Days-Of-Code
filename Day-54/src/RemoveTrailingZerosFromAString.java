
public class RemoveTrailingZerosFromAString {

    public static String removeTrailingZeros(String num) {

        int len = num.length();
        int index = -1;

        if(num.charAt(len-1)!='0'){
            return num;
        }

        for(int i=len-1;i>=0;i--)
        {
            if(num.charAt(i)!='0'){
                index = i;
                break;
            }
        }

        StringBuilder str = new StringBuilder("");

        for(int i=0;i<=index;i++)
        {
            str.append(num.charAt(i));
        }

        String s = new String(str);

        return s;

    }

    public static void main(String[] args) {

        String num = "51230100";

        String res = removeTrailingZeros(num);

        System.out.println(res);

    }
}