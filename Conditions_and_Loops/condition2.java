package Conditions_and_Loops;
import java.util.*;

public class condition2 {
    public static void main(String args[]){
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number id odd");
        }
    }
}
