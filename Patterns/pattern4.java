package Patterns;
import java.util.*;
    public class pattern4{
        public static void main(String args[]){
            Scanner scn = new Scanner(System.in);
            int row = scn.nextInt();
            for(int i=row;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
    }
}