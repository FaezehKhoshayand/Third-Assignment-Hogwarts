import java.util.ArrayList;
import java.util.Scanner;
public class Student extends Account{
    ArrayList<Course> courses;
    String house;
    Student(String username, String password) {
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
        Hogwarts.viewAllTeachers();
    }
    public void sortingQuiz() {//this is not the best way for doing this-_-
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
    public void signUp(Student student) {
        Hogwarts.studentsList.add(student);
    }
    //////////////////////login
}
