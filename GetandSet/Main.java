package GetandSet;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Corvette","Black",2022);
        car.setColor("Blue");
        car.setYear(2024);
        System.out.println(car.getModel()+" "+ car.getColor()+" " +car.getYear());
    }
    
}
