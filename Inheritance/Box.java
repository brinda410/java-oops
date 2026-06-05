package Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;   
    }
    //cube
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    Box(double length,double width,double height){
        this.l=length;
        this.w=width;
        this.h=height;
    }
    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
}
