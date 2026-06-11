package ClassObj;
public class Car {
    String model="Mustang";
    int year=2026;
    double price=15000000.22;
    boolean isRunning=false;

    void start(){
    isRunning=true;
    System.out.println("Engine started");
}
    void stop(){
    isRunning=false;
    System.out.println("Engine stopped");
    }
}
