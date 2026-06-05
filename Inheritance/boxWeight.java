package Inheritance;

public class boxWeight extends Box{
    double weight;
    
    public boxWeight(){
        this.weight=-1;
    }
    public boxWeight(double l,double w,double h,double weight){
        super(l,w,h);//initializes values of parent class
        this.weight=weight;
    }
    
}
