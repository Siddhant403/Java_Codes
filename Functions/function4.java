//--->>Multiplication
package Functions;

import java.util.Scanner;

public class function4 {
    public static int printProduct(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        int product= printProduct(a, b);
        System.out.println("Product:"+product);
    }
}
