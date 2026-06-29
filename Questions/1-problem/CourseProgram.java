import java.util.*;

class Course {
    private int cid;
    private String cname;
    private String cadmin;
    private int quiz;
    private int handson;

    public Course(int cid, String cname, String cadmin, int quiz, int handson) {
        this.cid = cid;
        this.cname = cname;
        this.cadmin = cadmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCadmin() {
        return cadmin;
    }

    public void setCadmin(String cadmin) {
        this.cadmin = cadmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getHandson() {
        return handson;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }
}

public class CourseProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 2; // Change to 4 for the original IPA question
        Course[] courses = new Course[n];

        for (int i = 0; i < n; i++) {

            int cid = sc.nextInt();
            sc.nextLine(); // consume newline

            String cname = sc.nextLine();
            String cadmin = sc.nextLine();

            int quiz = sc.nextInt();
            int handson = sc.nextInt();
            sc.nextLine(); // consume newline after handson

            courses[i] = new Course(cid, cname, cadmin, quiz, handson);
        }

        String admin = sc.nextLine();
        int handsonValue = sc.nextInt();

        int avg = findAvgOfQuizByAdmin(courses, admin);

        if (avg != 0) {
            System.out.println(avg);
        } else {
            System.out.println("No Course found");
        }

        Course[] result = sortCourseByHandson(courses, handsonValue);

        if (result != null) {
            for (Course c : result) {
                System.out.println(c.getCname());
            }
        } else {
            System.out.println("No Course found with mentioned attribute.");
        }

        sc.close();
    }

    public static int findAvgOfQuizByAdmin(Course[] courses, String admin) {

        int sum = 0;
        int count = 0;

        for (Course c : courses) {
            if (c.getCadmin().equalsIgnoreCase(admin)) {
                sum += c.getQuiz();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }

    public static Course[] sortCourseByHandson(Course[] courses, int handsonValue) {

        List<Course> filteredCourses = new ArrayList<>();

        for (Course c : courses) {
            if (c.getHandson() < handsonValue) {
                filteredCourses.add(c);
            }
        }

        if (filteredCourses.isEmpty()) {
            return null;
        }

        Collections.sort(filteredCourses, new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return Integer.compare(c1.getHandson(), c2.getHandson());
            }
        });

        return filteredCourses.toArray(new Course[0]);
    }
}