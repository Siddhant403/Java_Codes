package Conditions_and_Loops;
import java.util.*;

class table{
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int table;
        int i,sum;
        for(i=1;i<=10;i++)
        { 
            sum = num * i;
           System.out.println(sum);
        }
        }
}