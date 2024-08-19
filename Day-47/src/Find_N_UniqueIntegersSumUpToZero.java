public class Find_N_UniqueIntegersSumUpToZero {

    public static int[] sumZero(int n) {

        int[] arr = new int[n];

        int i = 0;
        int num = 1;

        if(n==1){
            arr[0] = 0;

            return arr;

        }

        if(n%2==0){
            while(i<arr.length-1){

                arr[i] = num;
                arr[i+1] = (-1*num);
                i += 2;
                num++;
            }

            return arr;
        }

        else{
            arr[0] = 0;

            i=1;
            while(i<arr.length-1){
                arr[i] = num;
                arr[i+1] = (-1*num);
                i += 2;
                num++;
            }

            return arr;
        }

    }
    public static void main(String[] args) {

        int n = 5;

        int[] res = sumZero(n);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}
