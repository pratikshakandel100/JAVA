package conditional_statement;
import java.util.*;

// to find the number is odd or even
public class exerciseif{
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       if (num % 2 == 0){
        System.out.print("The given number is even.");
       }
       else {
        System.out.print("The given number is odd.");
       }
       

    }
}
