import java.util.*;

public class SnakeInMatrix {
    public static int finalPositionOfSnake(int n, List<String> commands) {

        int ele = -1;
        int i=0;
        int j=0;

        for(int k=0;k<commands.size();k++)
        {
            if(commands.get(k).equals("RIGHT")){
                j++;
                ele = (i*n) + j;
            }

            else if(commands.get(k).equals("DOWN")){
                i++;
                ele = (i*n) + j;
            }

            else if(commands.get(k).equals("UP")){
                i--;
                ele = (i*n) + j;
            }

            else{
                j--;
                ele = (i*n) + j;
            }
        }

        return ele;

    }

    public static void main(String[] args) {

        List<String> commands = new ArrayList<String>();

    /*    commands.add("DOWN");
        commands.add("RIGHT");
        commands.add("UP");

        int n = 3;  */

        commands.add("RIGHT");
        commands.add("DOWN");

        int n=2;

        int ele = finalPositionOfSnake(n, commands);

        System.out.println(ele);

    }
}
