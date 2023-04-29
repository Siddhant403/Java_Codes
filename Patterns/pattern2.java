package Patterns;
import java.util.*;
    public class pattern2{
        public static void main(String args[]){
            Scanner scn = new Scanner(System.in);
            int row = scn.nextInt();
            int col = scn.nextInt();
            for(int i=1;i<=row;i++){
                for(int j=1;j<=col;j++){
                    if(i==1 || j==1 || i==row ||j==col){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                 }
                 System.out.println("");
            }
        }
    }