//-->>>Substraction
package Functions;
import java.util.*;

public class function3 {
    public static int printDiff(int a,int b){
        int diff = a - b;
        return diff;
    }    

    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();

        int diff = printDiff(a,b);
        System.out.println("Difference: "+ diff);
    }
}