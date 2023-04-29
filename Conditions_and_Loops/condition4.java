package Conditions_and_Loops;
import java.util.*;

class condition4{
    public static void main(String args[]){
        System.out.println("**** Greetings ****");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Button");
        System.out.print("1\t");
        System.out.print("2\t");
        System.out.println("3");
        
        int button = scn.nextInt();
        /*
        if(button==1){
            System.out.println("Hello");
        }
        else if(button==2){
            System.out.println("Namaste");    
        }
        else if(button==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Error 404..Button not found");
        } */
        switch (button) {
            case 1:
            System.out.println("Hello");
                break;
            case 2:
            System.out.println("Namaste"); 
                break;
            case 3:
            System.out.println("Bonjour"); 
            break;
            
            default:
            System.out.println("Error 404..Button not found");
                break;
        }
    }
}