package Inheritance;

public class Main {
    public static void main(String[]args){
        Box box=new Box();
        Box box1=new Box(4);
        Box box2=new Box(4.22,5.87,5.3);
        boxWeight box3=new boxWeight();
        boxWeight box4=new boxWeight(2,4,5,6);


        System.out.println("Box:"+box.l +" " + box.w + " " + box.h );
        System.out.println("Box1:"+box1.l +" " + box1.w + " " + box1.h);
        System.out.println("Box2:"+box2.l +" " + box2.w + " " + box2.h);
        System.out.println("Box3:"+box3.l +" " + box3.w + " " + box3.h);
        System.out.println("Box4:"+box4.l +" " + box4.w + " " + box4.h + " " + box4.weight);


    }
    
}
