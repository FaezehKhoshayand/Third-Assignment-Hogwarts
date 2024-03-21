import java.util.ArrayList;
public class Hogwarts {

    // TODO: Define Attributes
    static ArrayList<String> studentsList = new ArrayList<>();
    static ArrayList<String> teachersList = new ArrayList<>();
    static ArrayList<String> coursesList = new ArrayList<>();

    // TODO: Define Functionalities
    public void viewAllTeachers() {
        //TODO
        int i = 1;
        for(String teacher : teachersList) {
            System.out.print(i + "-" + teacher);
            i++;
        }
        System.out.println();
    }

    public void viewAllStudents() {
        //TODO
        int i = 1;
        for(String student : studentsList) {
            System.out.print(i + "-" + student);
            i++;
        }
        System.out.println();
    }

    public void viewAllCourses() {
        //TODO
        int i = 1;
        for(String course : coursesList) {
            System.out.print(i + "-" + course);
            i++;
        }
        System.out.println();
    }
}
