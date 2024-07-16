public class FindTheEncryptedString {
    public static  String  getEncryptedString(String s, int k) {

        int len = s.length();
        char[] arr = new char[len];
        int d=0;

        for(int i=0;i<s.length();i++)
        {
            d = (k+i)%len;
            arr[i] = s.charAt(d);
        }

        String str = new String(arr);

        return str;
    }
    public static void main(String[] args) {

        String s = new String("dart");
        int k= 3;

        String res =  getEncryptedString(s, k);

        System.out.println(res);

    }
}