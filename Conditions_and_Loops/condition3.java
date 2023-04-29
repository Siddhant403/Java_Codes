package Conditions_and_Loops;
import java.util.*;
public class condition3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        if(num1==num2)
        {
            System.out.println("Both are equal");
        }
        else if(num1>num2)
        {
            System.out.println("Number 1 is greater");
        }
        else{
            System.out.println("Number 1 is lesser");
        }
    }
}
