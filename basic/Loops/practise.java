// print the sum of the number
package Loops;
import java.util.*;
public class practise {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i;
            i += 1;
        }
        System.out.print(sum);
    }
    
}
