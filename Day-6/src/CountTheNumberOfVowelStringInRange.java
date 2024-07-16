public class CountTheNumberOfVowelStringInRange {

    public static boolean vowel(char ch)
    {
        if(ch == 'a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }

        return false;
    }

    public static int vowelStrings(String[] words, int left, int right) {

        int count=0;
        String str = "";
        int len = 0;

        for(int i=left;i<=right;i++)
        {
            str = words[i];
            len = str.length();

            if(vowel(str.charAt(0)) && vowel(str.charAt(len-1))){
                count++;
            }
        }

        return count;

    }
    public static void main(String[] args) {

        String[] words = {"hey","aeo","mu","ooo","artro"};
        int left  =1;
        int right=4;

        int res = vowelStrings(words,left,right);

        System.out.println(res);

    }
}