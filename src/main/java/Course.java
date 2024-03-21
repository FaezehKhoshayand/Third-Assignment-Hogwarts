import java.util.UUID;
import java.util.ArrayList;
public class Course {
    String courseTitle;
    UUID courseID;
    ArrayList<Student> courseStudents;
    Teacher courseTeacher;
    public void course(String courseTitle, Teacher courseTeacher) {
        this.courseTitle = courseTitle;
        this.courseTeacher = courseTeacher;
        this.courseID = UUID.randomUUID();
        courseStudents = new ArrayList<>();
    }
    public void addStudent(Student student) {
        courseStudents.add(student);
    }
}
