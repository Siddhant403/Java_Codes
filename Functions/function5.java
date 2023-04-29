//-->> Factorial
package Functions;
import java.util.*;

public class function5 {
    public static int Factorial(int a){

        //loop
        if(a<0){
            System.out.println("Invalid number");
            return 0;
        }
        int fact=1;
        for(int i=a;i>=1;i--)
        fact = fact *i;
        return fact;
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int factoial = Factorial(num);
        System.out.print("Factorial: "+factoial);

    }
}
