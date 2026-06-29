/*
Create a class Student with below attributes:

rollNo - int
name - String
subject - String
grade - char
date - String [DD/MM/YYYY]



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.


Create class Solution with main method.
****************************************************************************
Implement one static method: findStudentByGradeAndMonth Solution Class.


findStudentByGradeAndMonth Method:

This method will take an array of Student objects, char value as grade and int value as month 
for input parameters.The method will find out all Students from the given grade and month. 
This method will return array of Student object assending based on their rollNo if found. 
If there is no Student that matches then the method should return null.

for this method- main method should print Student name, subject and total student found [The 
length of the list], if the returned value is not null. If the returned value is null then 
main method should print "No student found".


NOTE:
	1. For Taking char as input use sc.nextLine().charAt(0)
	2. To match/check the month You havee to convert int month in the parameter to String.
	3. No need to count the Student array if return not null just print the array length.


****************************************************************************



Consider the below input and output:


input1:

111
Arijit
Math
B
22/09/2023
101
Priyanka
English
A
30/03/2022
107
Shreosi
History
C
13/05/2022
105
Tatan
Physics
A
27/03/2022
A
3


output1:

Priyanka
English
Tatan
Physics
2





input2:

111
Sohel
Math
B
22/09/2022
101
Priyanka
English
A
30/03/2022
107
Gopa
History
C
12/05/2022
105
Kamal
Physics
A
27/03/2022
A
7



output 2:

No student found


*/

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;

    public Student(int r, String n, String sub, char g, String d) {
        this.rollNo = r;
        this.name = n;
        this.subject = sub;
        this.grade = g;
        this.date = d;
    }

    // getters
    public int getRollNo() {
        return this.rollNo;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public char getGrade() {
        return this.grade;
    }

    public String getDate() {
        return this.date;
    }

    // setters
    public void setRollNo(int r) {
        this.rollNo = r;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setSubject(String s) {
        this.subject = s;
    }

    public void setGrade(char g) {
        this.grade = g;
    }

    public void setDate(String d) {
        this.date = d;
    }

}

public class Solution {
    public static Student[] findStudentByGradeAndMonth(
            ArrayList<Student> srr, char grade, int month) {

        ArrayList<Student> ans = new ArrayList<>();

        for (Student st : srr) {

            String[] parts = st.getDate().split("/");

            int studentMonth = Integer.parseInt(parts[1]);

            if (st.getGrade() == grade && studentMonth == month) {
                ans.add(st);
            }
        }

        if (ans.size() == 0) {
            return null;
        }

        ans.sort((a, b) -> a.getRollNo() - b.getRollNo());

        return ans.toArray(new Student[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> s = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int r = Integer.parseInt(sc.nextLine());
            String n = sc.nextLine();
            String sub = sc.nextLine();
            char g = sc.nextLine().charAt(0);
            String d = sc.nextLine();

            s.add(new Student(r, n, sub, g, d));

        }
        char grade = sc.nextLine().charAt(0);
        int month = Integer.parseInt(sc.nextLine());

        Student[] result = findStudentByGradeAndMonth(s, grade, month);

        if (result == null) {
            System.out.println("No student found");
        } else {

            for (Student st : result) {
                System.out.println(st.getName());
                System.out.println(st.getSubject());
            }

            System.out.println(result.length);
        }
    }
}