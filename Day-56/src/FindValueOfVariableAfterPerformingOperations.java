public class FindValueOfVariableAfterPerformingOperations {

    public static int finalValueAfterOperations(String[] operations) {

        int val=0;

        for(int i=0;i<operations.length;i++)
        {
            String str = operations[i];

            if(str.equals("X--") || str.equals("--X"))
            {
                val -= 1;
            }
            else if(str.equals("++X") || str.equals("X++")){
                val += 1;
            }
        }

        return val;
    }

    public static void main(String[] args) {

        String[] operations = {"--X","X++","X++"};

        int res = finalValueAfterOperations(operations);

        System.out.println(res);
    }
}
