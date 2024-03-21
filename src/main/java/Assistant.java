import java.util.ArrayList;

public class Assistant extends Account{
    ArrayList<Course> courses = new ArrayList<>();
    Assistant(String username, String password) {
        super(username,password);
    }
    public void removeTeacher(int index) {
        Hogwarts.teachersList.remove(index);
    }
    public void removeStudent(int index) {
        Hogwarts.studentsList.remove(index);
    }
    public void viewCourseStudent() {
        int i = 1;
        for(Course course : courses) {
            System.out.println(i + "-Title: " + course.courseTitle + " , Students: " + course.courseStudents);
            i++;
        }
    }
    public void checkProfile() {

    }
    public void createCourse(String title,Teacher teacher) {
        Course newCourse = new Course();
        courses.add(newCourse);
    }
}
