import java.util.ArrayList;
import java.util.Scanner;
public class Assistant extends Account{

    boolean hasLogged;
    Assistant(String username, String password) {
        super(username,password);
    }
    public void removeTeacher(Teacher teacher) {
        if(hasLogged) {
            Hogwarts.teachersList.remove(teacher);
        }
        else {
            System.out.println("YOU ARE NOT ALLOWED TO DO THIS.");
        }
    }
    public void removeStudent(Student student) {
        if(hasLogged) {
            Hogwarts.studentsList.remove(student);
        }
        else {
            System.out.println("YOU ARE NOT ALLOWED TO DO THIS.");
        }
    }
    public void viewCourseStudent() {
        if(hasLogged) {
            int i = 1;
            for(Course course : Hogwarts.coursesList) {
                System.out.println(i + "-Title: " + course.courseTitle + " , Students: " + course.courseStudents);
                i++;
            }
        }
        else {
            System.out.println("YOU ARE NOT ALLOWED TO DO THIS.");
        }
    }
    public void checkProfileStudent(Student student) {
        if(hasLogged) {
            System.out.println("Student's User Name: " + student.getUsername() + " Password: " + student.getPassword() + "House: " + student.house + "Courses: " + student.courses);
        }
        else {
            System.out.println("YOU ARE NOT ALLOWED TO DO THIS.");
        }
    }

    public void checkProfileTeacher(Teacher teacher) {
        if(hasLogged) {
            System.out.println("Student's User Name: " + teacher.getUsername() + " Password: " + teacher.getPassword() + "Courses: " + teacher.courses);
        }
        else {
            System.out.println("YOU ARE NOT ALLOWED TO DO THIS.");
        }
    }

    public void createCourse(Course course) {
        if(hasLogged) {
            Hogwarts.addCourse(course);
        }
        else {
            System.out.println("YOU ARE NOT ALLOWED TO DO THIS.");
        }
    }
    //signup
    public void signup(Assistant assistant) {
        if(hasLogged) {
            Hogwarts.assistantsList.add(assistant);
        }
        else {
            System.out.println("YOU ARE NOT ALLOWED TO DO THIS.");
        }
    }
    public Assistant login(String username,String password) {
        for(Assistant assistant : Hogwarts.assistantsList) {
            if(assistant.getUsername().equals(username) && assistant.getPassword().equals(password)) {
                hasLogged = true;
                return assistant;
            }
        }
        System.out.println("Invalid!");
        return null;
    }
    public void acceptRequestedStudent(Student student) {

    }
    public void acceptRequestedTeacher() {
        if(hasLogged) {
            int j = 1;
            for (Teacher i : Hogwarts.requestedTeachers) {
                System.out.println(j + "-" + i);
                j++;
            }
            System.out.println("Enter the number of the teacher you're willing to accept");
            Scanner in = new Scanner(System.in);
            int index = in.nextInt() - 1;
            Hogwarts.addTeacher(Hogwarts.requestedTeachers.get(index));
            Hogwarts.removeRequestedTeacher(Hogwarts.requestedTeachers.get(index));
        }
        else {
            System.out.println("YOU ARE NOT ALLOWED TO DO THIS.");
        }
    }
    public void acceptRequestedCourse() {
        if(hasLogged) {
            int j = 1;
            for (Course i : Hogwarts.requestedCourses) {
                System.out.println(j + "-" + i);
                j++;
            }
            System.out.println("Enter the number of the course you're willing to accept");
            Scanner in = new Scanner(System.in);
            int index = in.nextInt() - 1;
            Hogwarts.addCourse(Hogwarts.requestedCourses.get(index));
            Hogwarts.removeRequestedCourse(Hogwarts.requestedCourses.get(index));
        }
        else {
            System.out.println("YOU ARE NOT ALLOWED TO DO THIS.");
        }
    }
}
