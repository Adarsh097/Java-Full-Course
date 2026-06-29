public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Aditya";
        s1.age = 28;
        s1.rollNumber = 101;
        s1.college = "IIT Guwahati";

        s2.name = "Rohit";
        s2.age = 28;
        s2.rollNumber = 102;
        s2.college = "IIT Guwahati";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();



        Person p1 = new Person();
        p1.name = "Aditya";
        p1.age = 28;
        p1.height = 1.75f;
        p1.weight = 70.0f;

        p1.print();
        System.out.println("BMI of " + p1.name + " is " + p1.calculateBMI());
        System.out.println("Age of " + p1.name + " is " + p1.getAge());
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(name + " , " + age + " , " + rollNumber + " , " + college);
    }
}

// Java is almost complete object oriented programming


class Person {
    String name;
    int age;
    float height;
    float weight;

    void print(){
        System.out.println(name + " , " + age + " , " + height + " , " + weight);
    }

    double calculateBMI() {
        return weight / (height * height);
    }

    int getAge() {
        return age;
    }

}

