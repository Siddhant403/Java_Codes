package Basics;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int x = scn.nextInt();
        
        System.out.println("Enter the second number:");
        int y = scn.nextInt();
        
        int sum = x + y;
        System.out.println("Sum is " + sum);
    }
}
