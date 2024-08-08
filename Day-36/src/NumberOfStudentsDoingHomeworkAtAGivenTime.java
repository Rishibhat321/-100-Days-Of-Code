public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int c = 0;
        int len = startTime.length;

        for(int i=0;i<len;i++)
        {
            if(startTime[i]<=queryTime && queryTime<=endTime[i]){
                c++;
            }
        }

        return c;

    }

    public static void main(String[] args) {

        int[] start = {1,2,3};
        int[] end = {3,2,7};
        int q = 4;

        int res = busyStudent(start, end, q);

        System.out.println(res);

    }
}
