package ArrayObjects;

public class Cars {
    String model;
    String color;
    int year;

    Cars(String model,String color,int year){
        this.model=model;
        this.color=color;
        this.year=year;

        }
    void drive(){
            System.out.println("You drive the "+model+" the "+color+" one");

}
}

