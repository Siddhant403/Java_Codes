package Patterns;
import java.util.*;

public class pattern14{                      
    public static void main(String args[]){
        //diamond
        System.out.println("Enter value: ");
            Scanner pat = new Scanner(System.in);
            int row = pat.nextInt();

            for(int i=1;i<=row;i++){
                //--> spaces
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                 }
                 //--> stars
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=row;i>=1;i--){
                //--> spaces
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                 }
                 //--> stars
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
