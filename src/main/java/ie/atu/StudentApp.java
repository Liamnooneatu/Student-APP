package ie.atu;
import java.util.Scanner;
// Defined the StudentApp class
public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the first student: ");
        String name = scanner.nextLine();
        Student student1 = new Student();
        student1.setName(name);

        System.out.println("Enter the email of the first student: ");
        String email1 = scanner.nextLine();
        student1.setEmail(email);

        System.out.println("Enter the course of the first student: ");
        String course1 = scanner.nextLine();
        student1.setCourse(course);

    // print's the students details at the end
    private static void printStudentDetails(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Course: " + student.getCourse());
    }
}
