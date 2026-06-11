package ArrayObjects;

public class Main {
    public static void main(String[]args){
        Cars car1=new Cars("Ferrari","Red",2023);
        Cars car2=new Cars("Mustang","Black",2026);
        Cars car3=new Cars("Porsche","Pink",2026);
        System.out.println(car1.model);
        System.out.println(car2.color);
        System.out.println(car3.year);
        Cars[]car={car1,car2,car3};
        for(int i=0;i<car.length;i++){
            car[i].drive();
        }


    }
    
}
