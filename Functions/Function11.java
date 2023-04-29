//-->>Write a function that takes in the radius as input and returns the circumference of a circle.
package Functions;
import java.util.*;

public class Function11 {
    public static double Circum(int rad){
        double circum;
       circum = 2 * 3.14 *rad; 
        return circum;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        double circum = Circum(num);
        System.out.println("Circumference: "+ circum);
    }
}
