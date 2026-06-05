package classObjects;

public class classObj {
     public static void main(String[]args){
        Pen p1=new Pen();
        p1.color="Black";
        p1.tip=5;
        System.out.println("Pen color:"+p1.color);
        System.out.println("Pen tip:"+p1.tip);

    }
}
    class Pen{
        String color;
        int tip;

        void setColor(String newColor){
            color=newColor;
        }
        void setTip(int newTip){
            tip=newTip;
        }
    }

