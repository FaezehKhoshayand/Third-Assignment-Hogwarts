import java.util.ArrayList;
public class Hogwarts {

    // TODO: Define Attributes
    static ArrayList<Student> studentsList;
    static ArrayList<Teacher> teachersList;
    static ArrayList<Course> coursesList;

    // TODO: Define Functionalities
    Hogwarts() {
        studentsList = new ArrayList<>();
        teachersList = new ArrayList<>();
        coursesList = new ArrayList<>();
    }
    static public void viewAllTeachers() {
        //TODO
        int i = 1;
        for(Teacher teacher : teachersList) {
            System.out.print(i + "-" + teacher);
            i++;
        }
        System.out.println();
    }

    static public void viewAllStudents() {
        //TODO
        int i = 1;
        for(Student student : studentsList) {
            System.out.print(i + "-" + student);
            i++;
        }
        System.out.println();
    }

    static public void viewAllCourses() {
        //TODO
        int i = 1;
        for(Course course : coursesList) {
            System.out.print(i + "-" + course);
            i++;
        }
        System.out.println();
    }
}
