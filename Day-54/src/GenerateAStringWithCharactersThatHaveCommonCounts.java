public class GenerateAStringWithCharactersThatHaveCommonCounts {

    public static String generateTheString(int n) {

        char[] arr = new char[n];

        if(n%2!=0){
            for(int i=0;i<n;i++)
            {
                arr[i] = 'a';
            }

            String str = new String(arr);

            return str;
        }

        else{
            for(int i=0;i<n-1;i++)
            {
                arr[i] = 'a';
            }

            arr[n-1] = 'b';

            String str = new String(arr);

            return str;
        }

    }
    public static void main(String[] args) {

        int n = 4;
        String res = generateTheString(n);

        System.out.println(res);

    }
}
