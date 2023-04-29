package Basics;
import java.util.*;
 
class circle{
    public static void main(String args[]) {
        Scanner tcn = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double num = tcn.nextDouble();
        double area;
        area = 3.14 * num;
        
        System.out.println(area);
    }
 }