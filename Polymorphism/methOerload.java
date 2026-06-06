package Polymorphism;

public class methOerload {
    public static void main(String[]args){
        Calculator calc=new Calculator();
        System.out.println(calc.Sum(5,6));
        System.out.println(calc.Sum(5,6,6));
        System.out.println(calc.Sum(5.3f,6.5f));
        System.out.println(calc.Sum(5.7f,8.2f,6.7f));

    }
    
}
class Calculator{
    int Sum(int a,int b){
        return a+b;
    }
    int Sum(int a,int b,int c){
        return a+b+c;
    }
    float Sum(float a,float b){
        return a+b;
    }
     float Sum(float a,float b,float c){
        return a+b+c;
     }
}
