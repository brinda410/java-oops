package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class arrList {
    public static void main(String[] args) {
    
    ArrayList<String>fruits=new ArrayList<>();
    fruits.add("Banana");
    fruits.add("Coconut");
    fruits.add("Pineapple");
    fruits.add("Orange");
    fruits.add("Orange");
    fruits.remove(4);
    fruits.set(1,"Mango");
    System.out.println(fruits.get(2));
    //System.out.println(fruits);
    Collections.sort(fruits);
    System.out.println(fruits);
    
   }
    
}
