package HumanProject;

public class Human {
    String name;
    int age;
    float percentage;
    public static String college="BIT";
    public static long population;

    public Human(String name,int age,float percentage){
        this.name=name;
        this.age=age;
        this.percentage=percentage;
        Human.population+=1;
       
    }
    
}
