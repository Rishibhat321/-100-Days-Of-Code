public class ThreeConsecutiveOdds {

    public static boolean threeConsecutiveOdds(int[] arr) {

        int c=1;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]%2!=0 && arr[i+1]%2!=0){
                c++;

                if(c==3){
                    return true;
                }
                else{
                    continue;
                }
            }

            else{
                c=1;
            }
        }

        return false;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,34,3,4,5,7,23,12};

        boolean res = threeConsecutiveOdds(nums);

        if(res){
            System.out.println("There exists three consecutive odds");
        }
        else{
            System.out.println("Not exists");
        }

    }
}
