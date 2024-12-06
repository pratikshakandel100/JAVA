
package String;
import java.util.*;

public class Revise{
    public static void main(String[] args){
        String name = "Pratiksha Kandel";
        String age = "20";
        Scanner sc = new Scanner(System.in);
        String Surname = sc.next();
        System.out.println("Your surname is " + Surname);
        System.out.println(name.length());
        //mcharAt
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }




    }

    

}
