class Student{
    String name;
    int age;
    String college;

    Student(){
        this("Unknown");
        System.out.println("I am in first constructor");
    }

    Student(String name){
        this(name, 0);
        System.out.println("I am in second constructor");
    }

    Student(String name, int age){
        this(name, age, "Unknown");
        System.out.println("I am in third constructor");
    }

    Student(String name, int age, String college){
        this.name = name;
        this.age = age;
        this.college = college;

        System.out.println("I am in fourth constructor");
    }

    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}

public class Chaining {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.printDetails();

        Student s2 = new Student("Aditya");
        s2.printDetails();

    }
}

