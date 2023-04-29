package Patterns;
import java.util.*;
    public class pattern1{
        public static void main(String args[]){
            Scanner scn = new Scanner(System.in);
            int row = scn.nextInt();
            int col = scn.nextInt();
            for(int i=1;i<=row;i++){
                for(int j=1;j<=col;j++){
                    System.out.print("*");
                 }
                 System.out.println("");
            }
        }
    }
