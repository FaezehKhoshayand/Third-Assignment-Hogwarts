import java.util.ArrayList;
import java.util.Scanner;
public class Teacher extends Account{
    ArrayList<Course> courses;
    public Teacher(String username, String password) {
        super(username,password);
        courses = new ArrayList<>();
    }
    //access
    //sign up
    //login
    public void viewCourses() {
        int i = 1;
        for(Course course : courses) {
            System.out.println("Course");
                System.out.println(i + "-" + course.courseTitle);
                i++;
        }
    }
    public void takeCourse() {//each course has a teacher so how would a teacher wanna take a course--__----
        System.out.println("Which one do you want to take?");
        Hogwarts.viewAllCourses();
        Scanner in = new Scanner(System.in);
        in.nextInt();
        Course newCourse = new Course();
        Hogwarts.addCourse(newCourse);
    }
    public void signUp(Teacher teacher) {
        ////
        Hogwarts.teachersList.add(teacher);
    }
    public boolean login(String username,String password) {
        for(Teacher teacher : Hogwarts.teachersList) {
            if(teacher.getUsername().equals(username) && teacher.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }}
