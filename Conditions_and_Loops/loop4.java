package Conditions_and_Loops;
import java.util.*;

public class loop4{
    public static void main(String args[]){
        int input;
        do{
        Scanner num = new Scanner(System.in);
        input = num.nextInt();

        int sum;
            int val = num.nextInt();
            if(val>=90){
                System.out.println("This is Good");
            }
            else if(60 <= val && val <= 89){
                System.out.println("This is also Good");
            }
            else if(0 <= val && val <= 59){
                System.out.println("This is Good as well");
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println("Want to continue ? (yes(1) or no(0))");
            input = num.nextInt();
        }
        while(input == 1);
    }
}