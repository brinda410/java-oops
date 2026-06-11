package GetandSet;

public class Car {
    private String model;
    private String color;
    private int year;

    Car(String model,String color,int year){
        this.model=model;
        this.color=color;
        this.year=year;

        }
        String getModel(){
            return this.model;
        }
        String getColor(){
            return this.color;
        }
        int getYear(){
            return this.year;
        }
        void setColor(String color){
            this.color=color;
        }
        void setYear(int year){
            this.year=year;
        }
}
