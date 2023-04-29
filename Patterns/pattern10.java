package Patterns;
import java.util.*;
    public class pattern10{
        public static void main(String args[]){
            
            int row = 5;
            for(int i=1;i<=row;i++){
                for(int j=1;j<2*row+1;j++){
                    if((i+j)>5 && (i+j)<11){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            //Alternative solution
            /*for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            } */
        }
    }