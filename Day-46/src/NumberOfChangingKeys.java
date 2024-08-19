public class NumberOfChangingKeys {
    public static int countKeyChanges(String s) {

        int c = 0;
        char ch1 = ' ';
        char ch2 = ' ';

        for(int i=0;i<s.length()-1;i++)
        {
            ch1 = Character.toUpperCase(s.charAt(i+1));
            ch2 = Character.toLowerCase(s.charAt(i+1));

            if(s.charAt(i)!=ch1 && s.charAt(i)!=ch2){
                c++;
            }
        }

        return c;

    }
    public static void main(String[] args) {

        String s = "BbbB";

        int res = countKeyChanges(s);

        System.out.println(res);

    }
}
