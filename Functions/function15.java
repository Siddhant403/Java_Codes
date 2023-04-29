//--->>Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

package Functions;
import java.util.*;

public class function15{
    public static int printValue(int a,int b){
        int pow=1;
        for(int i=1;i<=b;i++){
            pow = pow * a;
        }
       return pow;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int val1 = scn.nextInt();
        System.out.println("Enter power: ");
        int val2 = scn.nextInt();
        int value = printValue(val1, val2);
        System.out.println("Value: "+value);
    }
}