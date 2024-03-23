import java.util.ArrayList;
import java.util.Scanner;
public class Student extends Account{
    ArrayList<Course> courses;
    String house;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public Student(String username, String password) {
        super(username,password);
        courses = new ArrayList<>();
        sortingQuiz();//ain't it wrong?
    }
    public void takeCourse(Course course) {
        courses.add(course);
    }
    public void viewCourses() {
        int i = 1;
        for(Course course : courses) {
            System.out.println(i + "-Title: " + course.courseTitle + " , Teacher: " + course.courseTeacher);
            i++;
        }
    }
    public void viewTeachers() {
        for(Course course : courses) {
            System.out.println(course.courseTeacher.getUsername());
        }
    }
    public void sortingQuiz() {
        System.out.println("Choose a house to enter:\n1-Gryffindor  2-Hufflepuff  3-Ravenclaw  4-Slytherin");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch(n) {
            case 1:
                this.house = "Gryffindor";
                break;
            case 2:
                this.house = "Hufflepuff";
                break;
            case 3:
                this.house = "Ravenclaw";
                break;
            case 4:
                this.house = "Slytherin";
                break;
            default:
                System.out.println("Invalid Option");
                sortingQuiz();
        }
    }
    public void signUp(Student student) {
        Hogwarts.addStudent(student);
    }
    public Student login(String username,String password) {
        for(Student student : Hogwarts.studentsList) {
            if(student.getUsername().equals(username) && student.getPassword().equals(password)) {
                System.out.println("Logged in!");
                return student;
            }
        }
        return null;
    }
}
