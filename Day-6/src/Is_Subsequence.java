public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {

        int len1 = s.length();
        int len2 = t.length();

        if(len1>len2){
            return false;
        }

        int i=0;
        int j=0;

        while(j<len2 && i<len1){

            if(t.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        return (i==s.length());
    }
    public static void main(String[] args) {

        String t = new String("ahbgdc");
        String s = new String("abc");

        boolean res = isSubsequence(s,t);

        if(res){
            System.out.println("Is Subsequence");
        }
        else{
            System.out.println("Not Subsequence");
        }


    }
}