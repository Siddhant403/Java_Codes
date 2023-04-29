package Patterns;
import java.util.*;
    public class pattern9{
        public static void main(String args[]){
            System.out.println("Enter value: ");
            Scanner pat = new Scanner(System.in);
            int num = pat.nextInt();
            for(int i=1;i<=num;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1\t");
                    }
                    else{
                        System.out.print("0\t");
                    }
                }
                System.out.println();
            }
        }
    }