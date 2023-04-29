package Patterns;
import java.util.*;

public class pattern15{                      
    public static void main(String args[]){
        //Hollow Butterfly
        System.out.println("Enter value: ");
            Scanner pat = new Scanner(System.in);
            int row = pat.nextInt();

            //------------->>> 1st half
            //--> stars
            for(int i=1;i<=row;i++){
                for(int j=1;j<=i;j++){
                    if(i==j || j==1)
                    System.out.print("*");

                    else{
                        System.out.print(" ");
                    }
                }

                //--> spaces
                for(int j=1;j<=2*(row-i);j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){

                    if(i==j || j==1)
                    System.out.print("*");

                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            
            //------------->>> 2nd half
            //--> stars
            for(int i=row;i>=1;i--){
                for(int j=1;j<=i;j++){
                    if(i==j || j==1)
                    System.out.print("*");

                    else{
                        System.out.print(" ");
                    }
                }

                //--> spaces
                for(int j=1;j<=2*(row-i);j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){

                    if(i==j || j==1)
                    System.out.print("*");

                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}