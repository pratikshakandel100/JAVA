package conditional_statement;
import java.util.*;

public class simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.print("You are eligible for voting.");
    
        }
        else {
            System.out.print("You are not eligible for voting.");
        }      

    }
}