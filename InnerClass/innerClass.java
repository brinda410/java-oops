package InnerClass;

public class innerClass {
    public static void main(String[]args){
        Car c=new Car();
        Car.color col=c.new color();
        Car.engine e=c.new engine();
        col.setColor();
        e.engineStart();
        e.engineCapacity();
    }
  
}
class Car{
    String name="Ferrari";

    class color{
        void setColor(){
            System.out.println(name+ " is Red");
        }
    }
    
    class engine{
        void engineStart(){
            System.out.println(name + " engine started.");  
        }
        void engineCapacity(){
             System.out.println("So " +name+ " engines typically range from about 3.0 liters to 6.5 liters in modern cars.");
        }
    }
}
