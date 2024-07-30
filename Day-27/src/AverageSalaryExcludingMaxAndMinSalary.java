
public class AverageSalaryExcludingMaxAndMinSalary {

    public static double average(int[] salary) {

        int max = salary[0];
        int min = salary[0];
        double sum = 0;


        for(int i=1;i<salary.length;i++)
        {
            if(max<salary[i]){
                max = salary[i];
            }

            if(min>salary[i]){
                min = salary[i];
            }
        }

        for(int i=0;i<salary.length;i++)
        {
            sum += salary[i];
        }

        sum = sum - min;
        sum = sum - max;

        int len = salary.length;

        double avg = sum/(len-2);

        return avg;

    }

    public static void main(String[] args) {

        int[] salary = {4000,3000,1000,2000};

        double res = average(salary);

        System.out.println("Average salary excluding max. and min.  salary is: " + res);

    }
}