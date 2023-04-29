package Patterns;
import java.util.*;

public class pattern17{                      
    public static void main(String args[]){
        //Hollow Rhombus
        System.out.println("Enter value: ");
            Scanner pat = new Scanner(System.in);
            int row = pat.nextInt();

            for(int i=1;i<=row;i++){

                //-->> spaces
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }

                //--> characters
                for(int j=1;j<=i;j++){
                        System.out.print(j+ " ");
                }
                System.out.println();
            }
        }
    }
