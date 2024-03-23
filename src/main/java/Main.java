/*
    TODO: Import all the classes that you have defined and make use of them to build the program.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hogwarts School Management System");
        Hogwarts hogwarts = new Hogwarts();
        Assistant Faezeh = new Assistant("Faezeh","Faezeh_12");
        Hogwarts.addAssistant(Faezeh);
        Teacher faezeh = new Teacher("faezeh" , "qweR_123");
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
        String username, password;
        int n = in.nextInt();
        switch(n) {
            case 1:
                System.out.println("Enetr your username: ");
                Scanner p = new Scanner(System.in);
                username = p.nextLine();
                System.out.println("Enetr your password: ");
                Scanner i = new Scanner(System.in);
                password = i.nextLine();
                Assistant assistant = new Assistant(username,password);
                assistant = assistant.login(username, password);
                assistantMenu(assistant);
                break;
            case 2:
                System.out.println("Enetr your username: ");
                Scanner q = new Scanner(System.in);
                username = q.nextLine();
                System.out.println("Enetr your password: ");
                Scanner y = new Scanner(System.in);
                password = y.nextLine();
                Teacher teacher = new Teacher(username,password);

                teacher = teacher.login(username, password);
                teacherMenu(teacher);
                break;
            case 3:
                System.out.println("Enetr your username: ");
                Scanner d = new Scanner(System.in);
                username = d.nextLine();
                System.out.println("Enetr your password: ");
                Scanner r = new Scanner(System.in);
                password = r.nextLine();
                Student student = new Student(username,password);
                student = student.login(username, password);
                studentMenu(student);
                break;
            case 4:
                runMenu();
                break;
            default:
                login();
        }
    }
    public static void signup() {
        System.out.println("Choose your role to signup\n1-Teacher  2-Student  3-Main Menu");
        Scanner in = new Scanner(System.in);
        String username, password;
        int n = in.nextInt();
        switch(n) {
            case 1:
                System.out.println("Enetr your username: ");
                Scanner q = new Scanner(System.in);
                username = q.nextLine();
                System.out.println("Enetr your password: ");
                Scanner y = new Scanner(System.in);
                password = y.nextLine();
                Teacher teacher = new Teacher(username,password);
                teacher.signUp(teacher);
                break;
            case 2:
                System.out.println("Enetr your username: ");
                Scanner d = new Scanner(System.in);
                username = d.nextLine();
                System.out.println("Enetr your password: ");
                Scanner r = new Scanner(System.in);
                password = r.nextLine();
                Student student = new Student(username,password);
                student.signUp(student);
                break;
            case 3:
                runMenu();
                break;
            default:
                signup();
        }
    }
    public static void assistantMenu(Assistant assistant) {
        System.out.println("Type in your desired option\n1-Remove teacher  2-Remove student 3-View course and student 4-Teacher profile 5-Student profile\n" +
                " 6-Create course  7-Change password 8-Change username  9-Accept requested courses  10-Accept requested teachers  11-Add assistant  12-Main Menu");
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
                System.out.println("Enter your new password");
                Scanner u = new Scanner(System.in);
                String newPassword = u.nextLine();
                while(!assistant.validatePassword(newPassword)) {
                    System.out.println("Invalid");
                    System.out.println("Enter your new password");
                    Scanner w = new Scanner(System.in);
                    newPassword = w.nextLine();
                }
                assistant.changePassword(newPassword);
                break;
            case 8:
                System.out.println("Enter your new username");
                Scanner t = new Scanner(System.in);
                String newUsername = t.nextLine();
                assistant.changeUsername(newUsername);
                break;
            case 9:
                assistant.acceptRequestedCourse();
                break;
            case 10:
                assistant.acceptRequestedTeacher();
                break;
            case 11:
                System.out.println("Enter a username for the new assistant");
                Scanner l = new Scanner(System.in);
                String username = l.nextLine();
                System.out.println("Enter a password for the new assistant");
                Scanner o = new Scanner(System.in);
                String password = o.nextLine();
                Assistant newAssistant = new Assistant(username, password);
                assistant.signup(newAssistant);
            case 12:
                runMenu();
                break;
            default:
                assistantMenu(assistant);
        }
    }
    public static void teacherMenu(Teacher teacher) {
        System.out.println("Type in your desired option\n1-View courses  2-Take course  3-Student scoring  4-Change password  5-Change username  6-Main Menu");
        Scanner in = new Scanner(System.in);
        switch(in.nextInt()) {
            case 1:
                teacher.viewCourses();
                break;
            case 2:
                teacher.takeCourse();////////bug dare ha
                break;
            case 3:
                ///////
                Hogwarts.viewAllStudents();
                //teacher.studentScoring();
                break;
            case 4:
                System.out.println("Enter your new password");
                Scanner n = new Scanner(System.in);
                String newPassword = n.nextLine();
                while(!teacher.validatePassword(newPassword)) {
                    System.out.println("Invalid");
                    System.out.println("Enter your new password");
                    Scanner w = new Scanner(System.in);
                    newPassword = w.nextLine();
                }
                teacher.changePassword(newPassword);
                break;
            case 5:
                System.out.println("Enter your new username");
                Scanner t = new Scanner(System.in);
                String newUsername = t.nextLine();
                teacher.changeUsername(newUsername);
                break;
            case 6:
                runMenu();
                break;
            default:
                teacherMenu(teacher);
        }
    }
    public static void studentMenu(Student student) {
        System.out.println("Type in your desired option\n1-View courses  2-Take course  3-View teachers  4-Change password  5-Change username  6-Main Menu");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        switch(x) {
            case 1:
                student.viewCourses();
                break;
            case 2:
                Hogwarts.viewAllCourses();
                System.out.println("Enter the number of your desired course");
                Scanner i = new Scanner(System.in);
                int index = i.nextInt();
                student.takeCourse(Hogwarts.coursesList.get(index - 1));
                break;
            case 3:
                student.viewTeachers();
                break;
            case 4:
                System.out.println("Enter your new password");
                Scanner n = new Scanner(System.in);
                String newPassword = n.nextLine();
                while(!student.validatePassword(newPassword)) {
                    System.out.println("Invalid");
                    System.out.println("Enter your new password");
                    Scanner w = new Scanner(System.in);
                    newPassword = w.nextLine();
                }
                student.changePassword(newPassword);
                break;
            case 5:
                System.out.println("Enter your new username");
                Scanner t = new Scanner(System.in);
                String newUsername = t.nextLine();
                student.changeUsername(newUsername);
                break;
            case 6:
                runMenu();
                break;
            default:
                studentMenu(student);
        }
    }
}
