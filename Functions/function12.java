//-->>Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
package Functions;
import java.util.*;

public class function12 {
    public static int Eligible(int age){
        if(age>=18){
            System.out.println(age+" Eligible for voting");
        }
        else if(age<=17 && age>=13){
            System.out.println(age+" Teenager...Not Eligible");
        }
        else{
            System.out.println(age+" Kiddooo.!!!");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        int eligiblity = Eligible(age);
    }
}
