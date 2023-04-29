//-->>Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

package Functions;
import java.util.*;

public class function14{
    
    public static void Display(int num){
       
    }
        public static void main(String args[]){
        int positive=0;
        int negative=0;
        int zeros=0;
        int num;
        System.out.println("Press 1 to continue and 0 to exit");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        while(input==1){
            System.out.println("Enter number: ");
            num = scn.nextInt();
            if(num>0){
                positive++;
            }
            else if(num<0){
                negative++;
            }
            else {
                zeros++;
            }
            System.out.println("Press 1 to continue and 0 to exit");
            input = scn.nextInt();
        }
        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);
    }
}
