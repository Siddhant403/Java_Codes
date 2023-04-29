package Conditions_and_Loops;
import java.util.*;

class condition1{   
    public static void main(String args[]){
        System.out.println("Enter your age: ");
        Scanner er = new Scanner(System.in);
        int age = er.nextInt();
        //if condition
        if(age>=18)
        {
            System.out.print("Adult");
        }
        //else condition
        else{
            System.out.print("Kiddo");
        }
    }
}