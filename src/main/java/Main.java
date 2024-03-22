/*
    TODO: Import all the classes that you have defined and make use of them to build the program.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hogwarts School Management System");
        Hogwarts hogwarts = new Hogwarts();
        runMenu();
    }

    public static void runMenu() {
        while(true) {
            System.out.println("1-Login 2-Sign up 3-Exit");
            Scanner in = new Scanner(System.in);
            switch(in.nextInt()) {
                case 1:
                    login();
                    break;
                case 2:
                    signup();
                    break;
                case 3:
                    return;
                default:
                    continue;
            }
        }
    }
    public static void login() {
        System.out.println("Choose your role to login\n1-Assistant  2-Teacher  3-Student  4-Main Menu");
        Scanner in = new Scanner(System.in);
        switch(in.nextInt()) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                return;
        }
    }

    public static void signup() {
        System.out.println("Choose your role to sign up\n1-Assistant  2-Teacher  3-Student  4-Main Menu");
        Scanner in = new Scanner(System.in);
        String username,password;
        switch(in.nextInt()) {
            case 1:
                Scanner e = new Scanner(System.in);
                username = e.nextLine();
                Scanner r = new Scanner(System.in);
                password = r.nextLine();//validate password chetoriiii
                Assistant assistant = new Assistant(username, password);
                //Assistant sign up
                assistantMenu(assistant);
                break;
            case 2:
                Scanner i = new Scanner(System.in);
                username = i.nextLine();
                Scanner n = new Scanner(System.in);
                password = n.nextLine();//validate password chetoriiii
                Teacher teacher = new Teacher(username, password);
                //teacher sign up
                teacherMenu(teacher);
                break;
            case 3:
                Scanner s = new Scanner(System.in);
                username = s.nextLine();
                Scanner w = new Scanner(System.in);
                password = w.nextLine();//validate password chetoriiii
                Student student = new Student(username, password);
                //student sign up
                studentMenu(student);
                break;
            case 4:
                runMenu();
        }
    }
    public static void assistantMenu(Assistant assistant) {
        System.out.println("Type in your desired option\n1-Remove teacher  2-Remove student 3-View course and student 4-Teacher profile 5-Student profile 6-Create course 7-Main Menu");
        Scanner in = new Scanner(System.in);
        switch(in.nextInt()) {
            case 1:
                Hogwarts.viewAllTeachers();
                System.out.println("Enter the number related to the teacher");
                Scanner s = new Scanner(System.in);
                int a = s.nextInt() - 1;
                assistant.removeTeacher(Hogwarts.teachersList.get(a));
                break;
            case 2:
                Hogwarts.viewAllStudents();
                System.out.println("Enter the number related to the student");
                Scanner z = new Scanner(System.in);
                int x = z.nextInt() - 1;
                assistant.removeStudent(Hogwarts.studentsList.get(x));
                break;
            case 3:
                assistant.viewCourseStudent();
                break;
            case 4:
                Hogwarts.viewAllTeachers();
                System.out.println("Enter the number related to the teacher");
                Scanner c = new Scanner(System.in);
                int v = c.nextInt() - 1;
                assistant.checkProfileTeacher(Hogwarts.teachersList.get(v));
                break;
            case 5:
                Hogwarts.viewAllStudents();
                System.out.println("Enter the number related to the student");
                Scanner n = new Scanner(System.in);
                int b = n.nextInt() - 1;
                assistant.checkProfileStudent(Hogwarts.studentsList.get(b));
                break;
            case 6:
                Hogwarts.viewAllCourses();
                System.out.println("Enter the number related to the course");
                Scanner m = new Scanner(System.in);
                int k = m.nextInt() - 1;
                assistant.createCourse(Hogwarts.coursesList.get(k));
                break;
            case 7:
                runMenu();
                break;
            default:
                assistantMenu(assistant);
        }
    }
    public static void teacherMenu(Teacher teacher) {
        System.out.println("Type in your desired option\n1-View courses  2-Take course 3-Main Menu");
        Scanner in = new Scanner(System.in);
        switch(in.nextInt()) {
            case 1:
                teacher.viewCourses();
                break;
            case 2:
                teacher.takeCourse();////////bug dare ha
                break;
            default:
                runMenu();
        }
    }
    public static void studentMenu(Student student) {
        System.out.println("Type in your desired option\n1-View courses  2-Take course  3-View teachers 4-Main Menu");
        Scanner in = new Scanner(System.in);
        switch(in.nextInt()) {
            case 1:
                student.viewCourses();
                break;
            case 2:
                Hogwarts.viewAllCourses();
                System.out.println("Enter your desired course");
                Scanner i = new Scanner(System.in);
                int index = i.nextInt()-1;
                Course course = Hogwarts.coursesList.get(index);
                student.takeCourse(course);
                break;
            case 3:
                student.viewTeachers();
                return;
            default:
                studentMenu(student);
        }
    }
}
