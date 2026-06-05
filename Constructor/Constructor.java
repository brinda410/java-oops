package Constructor;

public class Constructor {
    public static void main(String[]args){
        Student s1=new Student("Brinda",21,49);
        Student s2=new Student("Rahul",21,62);
        Student s3=new Student("Kriti",21,55);
        Student s4=new Student("Kiara",21,51);
        Student s5=new Student("Rohan",21,67);


        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.rollNo);
        System.out.println(s4.name);
        System.out.println(s5.rollNo);


    }
}
class Student{
    String name;
    int age;
    int rollNo;

    Student(String name,int age,int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;

    }
}
    

