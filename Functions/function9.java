///--->>>Write a function to print the sum of all odd numbers from 1 to n.

package Functions;
import java.util.*;

public class function9{
    public static int Sum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
         if(i%2!=0){
            sum = sum + i;
         }
        }
       return sum;
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int numb = scn.nextInt();
        int sum = Sum(numb);
        System.out.println(sum);
    }
}
