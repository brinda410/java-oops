package Abstraction;
public class Abstract {
    public static void main(String[]args){
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Lion l=new Lion();
        l.eat();
        l.walk();
        System.out.println(l.color);
    }  
}
abstract class Animal{
    String color;
    Animal(){
        color="Brown";
    }
    void eat(){
        System.out.println("Animal is eating food");
    }
    abstract void walk();
}
    class Horse extends Animal{
        void changeColor(){
            color="Dark brown";
        }
        void walk(){
            System.out.println("Horse has four legs");
        }
    }
    class Lion extends Animal{
        void changeColor(){
            color="Light brown";
        }
        void walk(){
            System.out.println("Lion has four legs");
        }

    }

