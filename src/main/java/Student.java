import java.util.ArrayList;
import java.util.Scanner;
public class Student extends Account{
    ArrayList<Course> courses = new ArrayList<>();
    String house;
    Student(String username, String password) {
        super(username,password);
    }
    public void takeCourse() {
        System.out.print("Choose your desired course.");
        Hogwarts.viewAllCourses();
        Scanner in = new Scanner(System.in);
        Course newCourse = new Course();
        //////////////////////////////////////k
    }
    public void viewCourses() {
        int i = 1;
        for(Course course : courses) {
            System.out.println(i + "-Title: " + course.courseTitle + " , Teacher: " + course.courseTeacher);
            i++;
        }
    }
    public void viewTeachers() {
        Hogwarts.viewAllTeachers();
    }
    public void sortingQuiz() {
        System.out.print("Choose a house to enter:\n1-Gryffindor  2-Hufflepuff  3-Ravenclaw  4-Slytherin");
        Scanner in = new Scanner(System.in);
        switch(in.nextInt()) {
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
}
