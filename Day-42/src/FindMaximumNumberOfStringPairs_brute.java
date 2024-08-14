public class FindMaximumNumberOfStringPairs_brute {

    public static int maximumNumberOfStringPairs(String[] words) {

        int pair = 0;

        String str = "";
        String st = "";

        for(int i=0;i<words.length;i++)
        {
            st = words[i];
            for(int j=i+1;j<words.length;j++)
            {
                str = words[j];
                String s =  new StringBuilder(str).reverse().toString();

                if(st.equals(s)){
                    pair++;
                }
            }
        }

        return pair;

    }
    public static void main(String[] args) {

        String[] pairs = {"cd","ac","dc","ca","zz"};

        int res = maximumNumberOfStringPairs(pairs);

        System.out.println(res);
    }
}
