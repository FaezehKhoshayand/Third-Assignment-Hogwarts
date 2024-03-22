import java.util.ArrayList;

public class Assistant extends Account{
    Assistant(String username, String password) {
        super(username,password);
    }
    public void removeTeacher(Teacher teacher) {
        Hogwarts.teachersList.remove(teacher);
    }
    public void removeStudent(Student student) {
        Hogwarts.studentsList.remove(student);
    }
    public void viewCourseStudent() {
        int i = 1;
        for(Course course : Hogwarts.coursesList) {
            System.out.println(i + "-Title: " + course.courseTitle + " , Students: " + course.courseStudents);
            i++;
        }
    }
    public void checkProfileStudent(Student student) {
        System.out.println("Student's User Name: " + student.getUsername() + " Password: " + student.getPassword() + "House: " + student.house + "Courses: " + student.courses);
    }

    public void checkProfileTeacher(Teacher teacher) {
        System.out.println("Student's User Name: " + teacher.getUsername() + " Password: " + teacher.getPassword() + "Courses: " + teacher.courses);
    }

    public void createCourse(Course course) {
        Hogwarts.addCourse(course);
    }
    //signup
    ///log in
    //security check if they have logged in
}
