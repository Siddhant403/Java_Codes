//--->> Addition
package Functions;

import java.util.*;

public class function2 {
    public static int printSum(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int sum=printSum(num1,num2);
        System.out.println("Sum: "+sum);
    }

}
