package oops;
class Apple{
    void taste(){
        System.out.println("Taste is sweet");
    }
}
class sano_apple extends Apple{
    void size(){
        System.out.println("Apple is small.");
    }
}
class thikka_ko_Apple extends sano_apple{
    void colorr(){
        System.out.println("Red");
    }
}



public class multipleinheritance {
    public static void main(String[] args) {
        sano_apple s = new sano_apple();
        thikka_ko_Apple t = new thikka_ko_Apple();
        Apple a = new Apple();
    t.colorr();
    t.taste();
    }
    
}
