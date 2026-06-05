package HumanProject;

public class Main {
    public static void main(String[]args){
        Human human1=new Human("Brinda",21,98.6f);
        Human human2=new Human("Kriti",21,95.6f);
        Human human3=new Human("Kiara",21,94.6f);

        System.out.println(human1.name);
        System.out.println(human2.name);
        System.out.println(human3.name);
        System.out.println("population:"+Human.population);

        System.out.println(Human.college);
        greeting();



    }
    static void greeting(){
        System.out.println("Hello this is Brinda");
    }
}
