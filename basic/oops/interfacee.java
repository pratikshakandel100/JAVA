package oops;
interface Car{
    public void start();
}

class ElectricCar implements Car{
    public void start(){
        System.out.println("Electric Car Starts.");
    }
}

class DiesalCar implements Car{
    public void start(){
        System.out.println("Diesal car starts");
    }
}

public class interfacee {
    public static void main(String[] args) {
        Car Tesla = new ElectricCar();
        Car XUV700 = new DiesalCar();
        Tesla.start();
        XUV700.start();


    }
    
}
