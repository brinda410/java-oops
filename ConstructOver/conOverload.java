package ConstructOver;

public class conOverload {
     public static void main(String[]args){
        Student s1=new Student("Brinda",21,49);
        Student s2=new Student("Rahul",21,62);
        Student s3=new Student("Kriti",55);
        Student s4=new Student("Kiara",21,51);
        Student s5=new Student();


        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.rollNo);
        System.out.println(s3.age);
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
    Student(){
        //constructor-overloading
    }
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
        //default age:0
    }
    
}
