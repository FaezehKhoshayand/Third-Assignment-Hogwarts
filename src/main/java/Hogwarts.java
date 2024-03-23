import java.util.ArrayList;
public class Hogwarts {

    static ArrayList<Student> studentsList;
    static ArrayList<Teacher> teachersList;
    static ArrayList<Course> coursesList;
    static ArrayList<Assistant> assistantsList;
    static ArrayList<Teacher>  requestedTeachers;
    static ArrayList<Course>  requestedCourses;

    Hogwarts() {
        studentsList = new ArrayList<>();
        teachersList = new ArrayList<>();
        coursesList = new ArrayList<>();
        assistantsList = new ArrayList<>();
        requestedTeachers = new ArrayList<>();
        requestedCourses = new ArrayList<>();
    }
    static public void viewAllTeachers() {
        int i = 1;
        for(Teacher teacher : teachersList) {
            System.out.print(i + "-" + teacher);
            i++;
        }
        System.out.println();
    }

    static public void viewAllStudents() {
        int i = 1;
        for(Student student : studentsList) {
            System.out.print(i + "-" + student);
            i++;
        }
        System.out.println();
    }

    static public void viewAllCourses() {
        int i = 1;
        for(Course course : coursesList) {
            System.out.print(i + "-" + course);
            i++;
        }
        System.out.println();
    }

    public static void addStudent(Student student) {
        studentsList.add(student);
    }
    public static void addTeacher(Teacher teacher) {
        teachersList.add(teacher);
    }
    public static void addCourse(Course course) {
        coursesList.add(course);
    }
    public static void addAssistant(Assistant assistant) {
        assistantsList.add(assistant);
    }
    public static void addRequestedTeacher(Teacher teacher) {
        requestedTeachers.add(teacher);
    }
    public static void addRequestedCourse(Course course) {
        requestedCourses.add(course);
    }
    public static void addRequestedStudent(Student student) {
        
    }
    public static void removeRequestedTeacher(Teacher teacher) {
        requestedTeachers.remove(teacher);
    }
    public static void removeRequestedCourse(Course course) {
        requestedCourses.remove(course);
    }
    public static void removeRequestedStudent(Student student) {

    }
}
