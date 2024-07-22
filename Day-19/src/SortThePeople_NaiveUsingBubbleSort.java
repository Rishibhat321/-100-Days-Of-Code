

public class SortThePeople_NaiveUsingBubbleSort {

    public static String[] sortPeople(String[] names, int[] heights) {

        for(int i=0;i<heights.length;i++)
        {
            for(int j=0;j<heights.length-1-i;j++)
            {
                if(heights[j]>heights[j+1])
                {
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;

                    String str = names[j];
                    names[j] = names[j+1];
                    names[j+1] = str;

                }
            }
        }

        int low = 0;
        int high = names.length-1;

        while(low<high){

            String s = names[low];
            names[low] = names[high];
            names[high] = s;

            low++;
            high--;
        }

        return names;

    }

    public static void main(String[] args) {

        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        String[] res = sortPeople(names,heights);

        for(String ele: res){
            System.out.print(ele + " ");
        }

    }
}