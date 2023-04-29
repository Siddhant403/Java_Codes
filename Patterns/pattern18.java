package Patterns;
import java.util.*;

public class pattern18{                      
    public static void main(String args[]){
        //Inverted Pyramid
        System.out.println("Enter value: ");
            Scanner pat = new Scanner(System.in);
            int row = pat.nextInt();

            for(int i=1;i<=row;i++){

                 //--> characters
                 for(int j=row;j>=i;j--){
                    System.out.print(i);
                }
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }

                System.out.println();
            }
        }
    }
