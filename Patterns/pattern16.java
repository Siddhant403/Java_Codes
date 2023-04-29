package Patterns;
import java.util.*;

public class pattern16{                      
    public static void main(String args[]){
        //Hollow Rhombus
        System.out.println("Enter value: ");
            Scanner pat = new Scanner(System.in);
            int row = pat.nextInt();

            for(int i=1;i<=row;i++){

                //--->> space
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                //--->> stars
                for(int j=1;j<=row;j++){
                    if(i==1 || j==1 || i==row || j==row){
                        System.out.print("*");
                    }
                    else{
                            System.out.print(" ");
                        }
                }
                System.out.println();
            }
    }
}