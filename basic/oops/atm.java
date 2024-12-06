import java.util.Scanner;

class ATMMachine {
    float Balance;
    int PIN = 5624;
    public void checkpin(){
        System.out.println("Enter your Pin : ");
        Scanner sc = new Scanner(System.in);
        int enteryourpin = sc.nextInt();
        if (enteryourpin == PIN){
            menu();
        }
        else{
            System.out.println("Enter  valid pin?");
        }


    }

    public void menu(){
        System.out.println("Enter your Choice: ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exist");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkMoney();
        }
        else if(opt == 2){
            withdrawMoney();
        }

        else if(opt == 3){
            depositMoney();

        }
        else if(opt == 4){
            return;
        }
        
        else{
            System.out.println("Enter a valid choice.");
        }
    }

    public void checkMoney(){
        System.out.println("Balance:" + Balance);
        menu();
    }
    
    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insufficent Amount.");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successfully.");
        }
        menu();
             

    }
    public void depositMoney(){
        System.out.println("Enter the Amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();

    }
}
    

public class atm{
    public static void main(String[] args){
        ATMMachine obj = new ATMMachine();
        obj.checkpin();

    }
}














    

