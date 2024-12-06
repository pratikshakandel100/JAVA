package conditional_statement;
import java.util.*;

public class switchh {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        // if (button == 1) {
        //     System.out.print("Hello");
        // }else if (button == 2){
        //     System.out.print("Namaste");
        
        // }else if (button ==3) {
        //     System.out.print("Bonjour");
        // } else{
        //     System.out.print("Invalid Buttom");
        // }


        switch (button) {
            case 1 : System.out.print("Hello");
            break;
            case 2 : System.out.print("Namaste");
            break;
            case 3 : System.out.print("Bonjour");
            break;
            default : System.out.print("Invalid Button");


        }
    }


    
}