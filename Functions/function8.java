//-->>Enter 3 numbers from the user & make a function to print their average.

package Functions;
import java.util.*;

public class function8 {
    public static float printAvg(int a,int b,int c){
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        float average = printAvg(num1,num2,num3);
        System.out.println(average);
    }
}
