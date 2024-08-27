
public class PercentageOfLetterInString {

    public static int percentageLetter(String s, char letter) {

        int c = 0;
        int len = s.length();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==letter){
                c++;
            }
        }

        int p = c*100/len;

        return p;

    }

    public static void main(String[] args) {

        String s = "foobar";
        char letter = 'o';

        int res = percentageLetter(s, letter);

        System.out.println(res);


    }
}