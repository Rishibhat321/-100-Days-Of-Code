
public class NumberOfSeniorCitizens {

    public static int countSeniors(String[] details) {

        int c = 0;

        String s = "";

        for(int i=0;i<details.length;i++)
        {
            String str = details[i];

            s += str.charAt(11);
            s += str.charAt(12);

            int num = Integer.parseInt(s);

            if(num>60){
                c++;
            }

            s = "";
        }

        return c;

    }
    public static void main(String[] args) {

        String[] details= {"7868190130M7522","5303914400F9211","9273338290F4010"};

        int res = countSeniors(details);

        System.out.println(res);

    }
}