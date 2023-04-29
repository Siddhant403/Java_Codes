package Patterns;
import java.util.*;

public class pattern13{
    public static void main(String args[]){
        System.out.println("Enter value: ");
            Scanner pat = new Scanner(System.in);
            int row = pat.nextInt();

            for(int i=1;i<=row;i++){     //pallandromic pyramid
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }

                for(int j=i;j>=1;j--){
                    System.out.print(j+"");
                }

                for(int j=2;j<=i;j++){
                    System.out.print(j+"");
                }
                System.out.println();
            }
    }
}


