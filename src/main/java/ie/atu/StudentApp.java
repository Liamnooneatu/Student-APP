package ie.atu;

// Import's the Scanner class to read user input
import java.util.Scanner;

// Defines the StudentApp class
public class StudentApp {
    public static void main(String[] args) {
        // Creates a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create the first student using setters
        System.out.println("Enter the name of the first student: ");
        String name1 = scanner.nextLine();
        Student student1 = new Student(); // Creates an instance of Student using a constructor
        student1.setName(name1); // Set the name using the setName string

        // Prompt the user for email and course, then set them using setters
        System.out.println("Enter the email of the first student: ");
        String email1 = scanner.nextLine();
        student1.setEmail(email1);

        System.out.println("Enter the course of the first student: ");
        String course1 = scanner.nextLine();
        student1.setCourse(course1);


        // Create the second student using a constructor
        System.out.println("Enter the name of the second student: ");
        String name2 = scanner.nextLine();

        System.out.println("Enter the email of the second student: ");
        String email2 = scanner.nextLine();

        System.out.println("Enter the course of the second student: ");
        String course2 = scanner.nextLine();

        Student student2 = new Student(name2, email2, course2); // Create an instance using a constructor



        // Create the third student using a constructor
        System.out.println("Enter the name of the third student: ");
        String name3 = scanner.nextLine();

        System.out.println("Enter the email of the third student: ");
        String email3 = scanner.nextLine();

        System.out.println("Enter the course of the third student: ");
        String course3 = scanner.nextLine();

        Student student3 = new Student(name3, email3, course3); // Create an instance using a constructor


        // Prints the details of all three students
        System.out.println("\n Details of the first student:");
        printStudentDetails(student1); //

        System.out.println("\n Details of the second student:");
        printStudentDetails(student2);

        System.out.println("\n Details of the third student:");
        printStudentDetails(student3);

        // Closes the Scanner
        scanner.close();
    }

    // print's the students details at the end using getters
    private static void printStudentDetails(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Course: " + student.getCourse());
    }
}



