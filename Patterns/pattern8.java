package Patterns;
import java.util.*;

public class pattern8{
    public static void main(String args[]){
        
       System.out.println("Enter value: ");
       Scanner pat = new Scanner(System.in);
        int num = pat.nextInt();
        int number=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}