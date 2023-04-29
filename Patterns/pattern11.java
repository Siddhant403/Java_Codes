package Patterns;
import java.util.*;

public class pattern11{
    public static void main(String args[]){
        System.out.println("Enter value: ");
            Scanner pat = new Scanner(System.in);
            int row = pat.nextInt();
                 for(int i=1;i<=row;i++){
                for(int j=1;j<row+i;j++){
                    if((i+j)==6 || (i+j)==8 || (i+j)==10 || (i+j)==12 || (i+j)==14){
                        System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            /* for(i=0;i<=row;i++){
                for(j=0;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(j=0;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            */
    }
}