import java.util.*;
class Student{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;


    public Student(int r, String n, String b, double s, boolean d){
        this.rollNo = r;
        this.name  = n;
        this.branch = b;
        this.score = s;
        this.dayScholar = d;
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isDayScholar() {
        return dayScholar;
    }

    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }
   
}

public class Solution {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[4];

        for(int i=0;i<4;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();
            students[i] = new Student(a,b,c,d,e);
        }

        int ans1 = findCountOfDayScholars(students);
        if(ans1>0){
            System.out.println(ans1);
        }else{
            System.out.println("No Day Scholar Found");
        }

        Student ans2 = findStudentWithSecondHighestScore(students);
        if(ans2!=null){
            System.out.println(ans2.getName());
            System.out.println(ans2.getBranch());
            System.out.println(ans2.getScore());
        }else{
            System.out.println("No Student Found"); 
        }
         sc.close();

    }

    public static int findCountOfDayScholars(Student[] students){
        int count = 0;
        for(Student s:students){
            if(s.isDayScholar()){
                count++;
            }
        }
        return count;
    }

    public static Student findStudentWithSecondHighestScore(Student[] students){
        Arrays.sort(students, new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                return Double.compare(s2.getScore(), s1.getScore());
            }
        });

        if(students.length < 2){
            return null;
        }

        double highestScore = students[0].getScore();
        for(int i=1; i<students.length; i++){
            if(students[i].getScore() < highestScore){
                return students[i];
            }
        }

        return null;
    }
}