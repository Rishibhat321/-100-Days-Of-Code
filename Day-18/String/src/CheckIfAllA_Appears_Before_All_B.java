public class CheckIfAllA_Appears_Before_All_B {

    public static boolean checkString(String s) {

        int index1= -1;
        int index2= -1;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'b'){
                index2 = i;
            }

            if(s.charAt(i)== 'a'){
                index1 = i;
            }

            if(index1!= -1 && index2!= -1)
            {
                if(index1>index2){
                    return false;
                }
                else{
                    continue;
                }
            }
        }


        return true;
    }

    public static void main(String[] args) {

        String s = "abab";

        boolean res = checkString(s);

        System.out.println(res);

    }
}