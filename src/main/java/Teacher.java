import java.util.ArrayList;
import java.util.Scanner;
public class Teacher extends Account{
    double score;
    ArrayList<Course> courses;
    public Teacher(String username, String password) {
        super(username,password);
        courses = new ArrayList<>();
        score = 0;
    }
    public void viewCourses() {
        int i = 1;
        for(Course course : courses) {
            System.out.println("Course");
                System.out.println(i + "-" + course.courseTitle);
                i++;
        }
    }
    public void takeCourse() {
        int i = 1;
        for(Course course : Hogwarts.requestedCourses ) {
            System.out.println(i + "-" + course.courseTitle);
            i++;
        }
        System.out.println("Enter the number of the course you're looking for");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt() - 1;
        Hogwarts.requestedCourses.get(index).courseTeacher = this;
    }

    public void signUp(Teacher teacher) {
        ////
        Hogwarts.teachersList.add(teacher);
    }
    public Teacher login(String username,String password) {
        for(Teacher teacher : Hogwarts.teachersList) {
            if(teacher.getUsername().equals(username) && teacher.getPassword().equals(password)) {
                return teacher;
            }
        }
        System.out.println("Invalid!");
        return null;
    }
    public void studentScoring(Student student,double score) {
        student.setScore(score);
    }
    public void requestCourse(Course course) {
        Hogwarts.addRequestedCourse(course);
    }
}
