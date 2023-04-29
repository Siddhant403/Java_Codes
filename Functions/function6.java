//--->> Even or Odd number1
package Functions;
import java.util.*;

public class function6 {
    public static int printEven(int num){
        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        num = printEven(num);
    }


}
