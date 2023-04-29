//--->>>Write a function which takes in 2 numbers and returns the greater of those two.
package Functions;
import java.util.*;

public class Function10 {
    public static int printGreater(int a, int b){
        if (a>b){
            System.out.println(a+" is Greater");
        }
        else{
            System.out.println(b+" is greater");
        }
        return 1; 
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int greater = printGreater(num1, num2);
    }
}
