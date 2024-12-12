

class Bank{
    public void RateOfInterest(){
        System.out.println("Rate of interest is 5%");
   }
}
class Global extends Bank{
    public void RateOfInterest(){
        System.out.println("Rate of interest is 6%");
    }

}
class Sanima extends Bank{
    public void RateOfInterest(){
      System.out.println("Rate of nterest is 8%");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Global G = new Global();
        Sanima S = new Sanima();
        Bank B = new Bank();
        G.RateOfInterest();
        S.RateOfInterest();
        B.RateOfInterest();
        
    }
    
}
