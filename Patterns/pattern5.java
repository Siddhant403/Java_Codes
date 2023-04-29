package Patterns;
import java.util.*;
    public class pattern5{
        public static void main(String args[]){
            Scanner scn = new Scanner(System.in);
            int row = scn.nextInt();
                 for(int i=1;i<=row;i++){
                // space
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                 }
                 //stars print
                 for(int j=1;j<=i;j++){
                    System.out.print("*");
                 }
                 System.out.println();
            }
        }
    }