import java.util.ArrayList;

public class Teacher extends Account{
    ArrayList<Course> courses = new ArrayList<>();
    public Teacher(String username, String password) {
        super(username,password);
    }
    public void viewTCourses() {
        int i = 1;
        for(Course course : courses) {
            if(course.courseTeacher.equals(super.usernameGetter())) {
                System.out.println(i + "-Title: " + course.courseTitle);
                i++;
            }
        }
    }
}
