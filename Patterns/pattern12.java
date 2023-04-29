package Patterns;
import java.util.*;

public class pattern12{
    public static void main(String args[]){
        System.out.println("Enter value: ");
            Scanner pat = new Scanner(System.in);
            int row = pat.nextInt();                 //Butterfly
            //Upper half
            //space
            for(int i=1;i<=row;i++){
                //stars-- first half
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //spaces
                for(int j=1;j<=(2*(row-i));j++){
                    System.out.print(" ");
                }

                //stars-- second half
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            //Lower half

             //space
             for(int i=row;i>=1;i--){
                //stars-- first half
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //spaces
                for(int j=1;j<=(2*(row-i));j++){
                    System.out.print(" ");
                }

                //stars-- second half
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }