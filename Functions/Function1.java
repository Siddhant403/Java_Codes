//--->> Prinitng
package Functions;
import java.util.*;

public class Function1 {
    //--->>Declaring Function
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String name = scn.next();

        printMyName(name);  //--->> Function calling..!!!!
    }
}
